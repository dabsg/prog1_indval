package rättning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Uppgift extends JFrame implements ActionListener {
    JLabel namnLabel, lösernordLabel, ämneLabel, termsLabel;
    JTextField namnTextField;
    JPasswordField passwordField;
    JRadioButton javaRadioButton, javascriptRadioButton, htmlRadioButton, cssRadioButton;
    JCheckBox termsCheckBox;
    JButton submitButton;

    public Uppgift() {
        setTitle("Användarregistreringsformulär");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(9, 6));

        namnLabel = new JLabel("använder namn: ");
        lösernordLabel = new JLabel("lösenord: ");
        ämneLabel = new JLabel("ämne: ");
        termsLabel = new JLabel("Jag har läst och godkänner villkoren.");

        namnTextField = new JTextField();
        passwordField = new JPasswordField();

        
        javaRadioButton = new JRadioButton("Java");
        javascriptRadioButton = new JRadioButton("JavaScript");
        htmlRadioButton = new JRadioButton("HTML");
        cssRadioButton = new JRadioButton("CSS");
        ButtonGroup radioButtonGroup = new ButtonGroup();
        
        
        radioButtonGroup.add(javaRadioButton);
        radioButtonGroup.add(javascriptRadioButton);
        radioButtonGroup.add(htmlRadioButton);
        radioButtonGroup.add(cssRadioButton);

        termsCheckBox = new JCheckBox();

        submitButton = new JButton("login");
        submitButton.addActionListener(this);

        add(namnLabel);
        add(namnTextField);
        add(lösernordLabel);
        add(passwordField);
        add(ämneLabel);
        
        add(new JLabel());
        add(javaRadioButton);
        add(javascriptRadioButton);
        add(htmlRadioButton);
        add(cssRadioButton);
        
        
        add(termsLabel);
        add(termsCheckBox);
        add(new JLabel());
        add(submitButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (termsCheckBox.isSelected()) {
            String namn = namnTextField.getText();
            String lösernord = new String(passwordField.getPassword());
            String ämne = "";
            if (javaRadioButton.isSelected()) {
                ämne += "Java ";
            }
            if (javascriptRadioButton.isSelected()) {
                ämne += "JavaScript ";
            }
            if (htmlRadioButton.isSelected()) {
                ämne += "HTML ";
            }
            if (cssRadioButton.isSelected()) {
                ämne += "CSS ";
            }
            JOptionPane.showMessageDialog(this,
                    "inloggning lyckades " + namn + "\nlösernord: " + lösernord + "\nämne: " + ämne);
        } else {
            JOptionPane.showMessageDialog(this, "Vänligen läs och godkänn villkoren.");
        }
    }
    

    public static void main(String[] args) {
        new Uppgift();
    }
}