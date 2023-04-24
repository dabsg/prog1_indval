package rättning;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;                  // importerar in klasser
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class kontoupg {

    JFrame f = new JFrame();                      // skapar rutan (Jframen)
    JLabel javascript = new JLabel("javascript");
    JLabel java = new JLabel("java");
    JLabel css = new JLabel("html och css");
    JLabel response1 = new JLabel();                   // skapar alla JLabels
    JLabel response2 = new JLabel();
    JLabel response3 = new JLabel();
    JLabel användarnamn = new JLabel("användarnamn");
    JLabel lösenord1 = new JLabel("lösenord");
    JLabel lösenord2 = new JLabel("lösenord");
    
    JTextField t1 = new JTextField(20);
    JTextField t2 = new JTextField(20);            // skapar alla textfält där man kan skriva in data
    JTextField t3 = new JTextField(20);
    

    JRadioButton b1 = new JRadioButton();
    JRadioButton b2 = new JRadioButton();           // skapar alla RadioButtons 
    JRadioButton b3 = new JRadioButton();
    JCheckBox b = new JCheckBox("Har du läst villkoren?");     // Skapar checkboxen 
    JButton skapakonto = new JButton("skapa konto");     // skapar den "slutgiltiga" knappen som verkställer allt

    ButtonGroup group = new ButtonGroup(); // grupperar alla så att man bara kan välja en radiobutton i taget

    public kontoupg() {  // kontstruktor

        group.add(b1);
        group.add(b2);
        group.add(b3);
        f.setVisible(true);
        f.setSize(1200, 400);
        f.setLayout(new FlowLayout());
        f.add(javascript);
        f.add(b1);
        f.add(java);
        f.add(b2);
        f.add(css);
        f.add(b3);
        f.add(användarnamn);
        f.add(t1);
        f.add(lösenord1);
        f.add(t2);                  // lägger till allt i konstruktorn 
        f.add(lösenord2);
        f.add(t3);
        f.add(b);
        f.add(skapakonto);
        f.add(response1);
        f.add(response2);
        f.add(response3);

        skapakonto.addActionListener(e -> {   // lägger till en avläsare till att det som händer 

            String hej = t2.getText();

            String stjärna = "";

            for (int i = 0; i < hej.length(); i++) {   // skapare en loop som lägger till en stjärna för varje gång den kör, loopen representerar lösenordets längd

                stjärna += "*";

            }

            if (t2.getText().equals(t3.getText()) && b.isSelected()) { // kontrollerar om både kraven är uppfyllda, då kan du skapa ett konto

                response2.setText("Du har skapat ett konto. Dina uppgifter är följande: " + " Ditt användarnamn: "
                        + t1.getText() + " Ditt lösenord:" + stjärna);                                               // alla uppgifter

            }
            

            if (b.isSelected()) { //kollar om du klickat i checkboxen

            } else {

                response2.setText("Du har inte godkänt villkoren");  // vad som skrivs ut om du inte klickat i checkboxen
            }

            if (t2.getText().equals(t3.getText())) { //kontrollerar om lösenorden är samma

            } else {

                response3.setText("Du har inte skrivit in samma lösenord"); // vad som skrivs ut om lösenorden inte är lika

            }
            
            if (b1.isSelected()) { // hela denna if sats kollar vilket språk du valt

                response1.setText("du valde javascript");
            } else if (b2.isSelected()) {
                response1.setText("du valde java");

            } else if (b3.isSelected()) {

                response1.setText("du valde html / css");

            } else {

                response1.setText("Du har inte valt ett programmeringsspråk"); // vad som skrivs ut om man inte väljer något språk
            }

        });

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // stoppar konsolkörning när man trycker av 

    }

    public static void main(String[] args) {

        new kontoupg(); // skapar objekt av klassen
    }

}