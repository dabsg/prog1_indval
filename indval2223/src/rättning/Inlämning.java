package rättning;

import java.awt.FlowLayout; //Importering av alla nödvändiga klasser

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Inlämning {
    JFrame f = new JFrame(); // Öppnar Jframe

    JLabel Javascript = new JLabel("Javascript"); // Skapar alla JLabels
    JLabel Csshtml = new JLabel("Css/html");
    JLabel Java = new JLabel("Java");
    JLabel res = new JLabel("");
    JLabel språk = new JLabel("");
    JLabel Användarnamn = new JLabel("Användarnamn");
    JLabel Lösenord = new JLabel("Lösenord");
    JLabel Lös2 = new JLabel("Ange lösenord igen");

    JRadioButton b1 = new JRadioButton(); // Skapar alla Radiobuttons
    JRadioButton b2 = new JRadioButton();
    JRadioButton b3 = new JRadioButton();

    JCheckBox check = new JCheckBox("Jag godkänner vilkåren"); // Skapar JCheckBox

    JButton skapak = new JButton("Skapa konto"); // Skapar och sätter text på JButton

    ButtonGroup group = new ButtonGroup(); // Skapar grupp för alla Jradiobuttons

    JTextField t1 = new JTextField(20); // Skapar alla JTextfields
    JTextField t2 = new JTextField(20);
    JTextField t3 = new JTextField(20);

    public Inlämning() { // skapar konstruktor

        f.setVisible(true); // sätter dimentioner och layout på JFrame
        f.setSize(1200, 400);
        f.setLayout(new FlowLayout());

        f.add(Användarnamn); // Lägger till textfields för Användarnamn och Lösenord + Sätter en JLabel
                                // framför

        f.add(t1); // Användarnamn och lösenords implementering i JFramen
        f.add(Lösenord);
        f.add(t2);
        f.add(Lös2);
        f.add(t3);

        group.add(b1); // Lägger in alla Radio
        group.add(b2);
        group.add(b3);

        f.add(b1); // Implementerar alla Jradiobuttons och labels
        f.add(Javascript);
        f.add(b2);
        f.add(Csshtml);
        f.add(b3);
        f.add(Java);

        f.add(check);
        f.add(skapak); // Lägger till Jbutton för att skapa kontot

        f.add(res); // Lägger till utskrifter
        f.add(språk);

        skapak.addActionListener(e -> { // Lägger till en actionlistener

            String st1 = t1.getText();
            String st2 = t2.getText();
            String st3 = t3.getText();

            String stjärnor = " ";

            for (int i = 0; i < st3.length(); i++) { // Loop för att omvandla lösenordet till *or

                stjärnor += "*";

            }

//            Härifrån analyseras villkoren för att skapa kontot, alla möjliga utfall analyseras
            if (st2.equals(st3) && check.isSelected()) {

                res.setText("Du har skapat ditt konto " + " Dina uppgifter är " + "Användarnamn: " + st1 + " "
                        + "Lösenord: " + stjärnor);

            }

            if (st2.equals(st3)) {

            } else {
                res.setText(" Kontrollera att lösenorden matchar");
            }

            if (check.isSelected()) {

            } else {
                res.setText("Har du läst villkåren?");
            }

            if (b1.isSelected()) {
                språk.setText("Du har valt javaskript");
            } else if (b2.isSelected()) {
                språk.setText("Du har valt Css / Html");
            } else if (b3.isSelected()) {
                språk.setText("Du har valt Java");
            } else {
                språk.setText("Du har inte valt ett programmerings språk");
            }
        });

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Avslutar programmkörning vid stängande av rutan
    }

    public static void main(String[] args) {

        new Inlämning(); // skapar objekt av klassen

    }
}