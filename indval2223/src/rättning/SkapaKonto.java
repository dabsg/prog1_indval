package rättning;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.Console;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.html.HTML;

public class SkapaKonto {
 
    
      // kan man ändra ett ord på alla ställe från ett plats ?    == ctrl + f 
    
    private JFrame frame;
    private JLabel passwordLabel1, passwordLabel2, accountname, felmeddelande;
    private JPasswordField passwordField1, passwordField2;
    private JTextField username;
    private JCheckBox checkBox; 
    private JRadioButton javabutton,htmlbutton,cssbutton,javascriptbutton;
    private JButton Button;

    public SkapaKonto() {

        frame = new JFrame("Taleb");
        frame.setLayout(new GridLayout(7,2) ); // GridLayout??   Flow??  //GridLayout(8,2)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,500);

        accountname = new JLabel(" Enter name");
        username= new JTextField(10);
        passwordLabel1 = new JLabel(" Enter password");
        passwordLabel2 = new JLabel(" Confirm password please");
        passwordField1 = new JPasswordField(10);
        passwordField2 = new JPasswordField(10); // 10 = längd
        javabutton = new JRadioButton("Java");
        htmlbutton = new JRadioButton("Html");
        cssbutton = new JRadioButton("Css");    
        javascriptbutton = new JRadioButton("javascript");
        checkBox = new JCheckBox("I Agree");
        Button = new JButton("Creat Account");
        felmeddelande= new JLabel();
        
        
        ButtonGroup interests = new ButtonGroup();
        interests.add(cssbutton);
        interests.add(htmlbutton);
        interests.add(javabutton);
        interests.add(javascriptbutton);
        
        frame.add(accountname);
        frame.add(username);
        frame.add(passwordLabel1);
        frame.add(passwordField1);
        frame.add(passwordLabel2);
        frame.add(passwordField2);
        frame.add(javascriptbutton);
        frame.add(cssbutton);
        frame.add(htmlbutton);
        frame.add(javabutton);
        frame.add(checkBox);
        frame.add(Button);
        frame.add(felmeddelande);
        
        frame.setVisible(true);

        // när man trycker "create"
        Button.addActionListener(e -> {

            String password1 = new String(passwordField1.getPassword());
            String password2 = new String(passwordField2.getPassword());
            String name = username.getText();
            String interest = "";
            String fel = "";
            
            if(!password1.equals(password2)  )  {     
                fel += "Please check your password.";
                
            }
            if (!checkBox.isSelected()) {
                
                fel+= " please check your checkbox. ";
            }
            if (!cssbutton.isSelected() && !javabutton.isSelected() && !javascriptbutton.isSelected() && !htmlbutton.isSelected()) {
                
                fel+= " please check your interest.  ";
            }
            if (name.isEmpty() ) {              
                 
                fel+= " please check your username.  ";
            }

            // kolla vilke intrese man vald
            if(javascriptbutton.isSelected()) {
                interest += "JavaScript";
            }
            if(javabutton.isSelected()) {
                interest += "Java";
            }
            if(htmlbutton.isSelected()) {
                interest += "html";
            }
            if(cssbutton.isSelected()) {
                interest += "css";
            }                
            
            // alla information i slutet + felmeddelande
            
            if (password1.equals(password2) && checkBox.isSelected() && !interest.equals("")  &&!name.isEmpty() ) {
                JOptionPane.showMessageDialog(frame, "Account created:  " + name + ".\nPassword: " + maskPassword(password1) + ".\nIntreset: " + interest);
            } else {
//                felmeddelande.setText(fel);
                JOptionPane.showMessageDialog(frame, fel);
            }

        });

    }
        // gömma lösenord
    private String maskPassword(String password) {

        int length = password.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append('*');
        }
        return sb.toString();
    }

    

    
    public static void main(String[] args) {
        new SkapaKonto();

    }
    
    

}