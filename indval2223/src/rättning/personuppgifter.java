package rättning;



import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class personuppgifter  {
    
    
    JFrame frame = new JFrame("Registrera");   // fast variabelnamn
    JButton loggaInButton = new JButton("Logga in");
    JButton återställButton = new JButton("Återställa");
    JTextField användarNamnField = new JTextField(10);
    JPasswordField lösenordField = new JPasswordField(10);
    JLabel användarNamnLabel = new JLabel("Användarnamn:");
    JLabel lösenordLabel = new JLabel("Lösenord:");
    JLabel intresseLabel = new JLabel("Intresse:");
    JRadioButton javaButton = new JRadioButton("Java");
    JRadioButton javascriptButton = new JRadioButton("JavaScript");
    JRadioButton htmlButton = new JRadioButton("HTML");
    JRadioButton cssButton = new JRadioButton("CSS");
    JCheckBox villkorCheckBox = new JCheckBox("Jag har läst villkoren och accepterar dem");
    JLabel meddelandeLabel = new JLabel();
    
     
    
    public personuppgifter() {  //  konstruktor för JFrame 
        
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(användarNamnLabel);
        frame.add(användarNamnField);
        frame.add(lösenordLabel);
        frame.add(lösenordField);
        frame.add(intresseLabel);
        frame.add(javaButton);
        frame.add(javascriptButton);
        frame.add(htmlButton);
        frame.add(cssButton);
        frame.add(villkorCheckBox);
        frame.add(loggaInButton);
        frame.add(återställButton);
        frame.add(meddelandeLabel);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new personuppgifter();
    }
}