package rättning;



import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Inlämning2 {

    JFrame f = new JFrame(); // känner till relation

    JLabel javascipt = new JLabel("Javascript"); // lägger till labels/text i fönstret
    JLabel html = new JLabel("html / css");
    JLabel java = new JLabel("java");
    JLabel name = new JLabel("Username");
    JLabel lösenord = new JLabel("Password");
    JLabel bekräfta = new JLabel("Confirm Password");
    JLabel ToS = new JLabel("Har du läst våra villkor?");
    JLabel sk = new JLabel("");
    JLabel ps = new JLabel("");

    
    JRadioButton b1 = new JRadioButton(); // knappar så att man kan välja vilket kodspråk
    JRadioButton b2 = new JRadioButton();
    JRadioButton b3 = new JRadioButton();
    JCheckBox tos = new JCheckBox(); // checklåda till villkoren

    JTextField user = new JTextField(15); // Mått på lådorna för att skriva in uppgifter
    JTextField pass = new JTextField(15);
    JTextField confirm = new JTextField(15);

    JButton skapaKonto = new JButton("Skapa Konto");
    ButtonGroup group = new ButtonGroup();

    public Inlämning2() {// konstruktor, samma namn som klassen

        group.add(b1);// lägger till radiobuttons i en grupp
        group.add(b2);
        group.add(b3);

        f.setVisible(true); // sätter true så att fönstret syns
        f.setSize(700, 400); // mått på fönstret
        f.setLayout(new FlowLayout());
        f.add(name); // lägger till alla knappar, labels, osv.
        f.add(user);
        f.add(lösenord);
        f.add(pass);
        f.add(bekräfta);
        f.add(confirm);
        f.add(javascipt);
        f.add(b1);
        f.add(html);
        f.add(b2);
        f.add(java);
        f.add(b3);
        f.add(ToS);
        f.add(tos);
        f.add(sk);
        f.add(ps);
        f.add(skapaKonto);
        
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // programmet stängs ner efter man stänger fönstret

        skapaKonto.addActionListener(e -> { // ett event/händelse

            if (!b1.isSelected() && !b2.isSelected() && !b3.isSelected() || !tos.isSelected()
                    || user.getText().isEmpty() || pass.getText().isEmpty() || confirm.getText().isEmpty()
                    || !pass.getText().equals(confirm.getText())) {
                sk.setText("Du kan inte skapa ett konto"); // ser till att allting måste vara ifyllt för att kunna skapa
                                                            // ett konto
            } else {
                sk.setText("Konto skapat!");
                
            }
            
            String info = "";
            
            for (int i = 0; i < pass.getText().length(); i++) {
                info = info + "*";
                ps.setText(info); //for-loop som används för att ändra alla bokstäver/siffror till *, använder en loop eftersom lösenordet kan vara hur långt som användaren vill
            }

            String lang = " ";

            if (b1.isSelected()) { //if-sats beroende på vilket kodspråk användaren väljer lagras i variabeln lang, kort för language
                lang = "javascript";
            } else if (b2.isSelected()) {
                lang = "HTML och CSS";
            } else if (b3.isSelected()) {
                lang = "java";
            }
            
            
            String print = name.getText()+": "+user.getText()+" "+lösenord.getText()+": " +info+" Code Language: "+lang;
            ps.setText(print);//printar ut uppgifterna på sista labeln
        });

    }

    public static void main(String[] args) {
        new Inlämning2(); // skapar objekt av klassen
    }
}