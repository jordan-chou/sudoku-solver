/*
 * Jordan Chou
 * 
 * github.com/jordan-chou
 * 
 * Defines the class that holds the number buttons in a panel
 */

 import javax.swing.JPanel;
 import javax.swing.JButton;
 import java.awt.GridLayout;

 public class NumberPad {
    JPanel numberPad;

    public NumberPad() {
        numberPad = new JPanel();

        for (int i = 7; i >= 1 && i <= 9; i++) {
            numberPad.add(new JButton(Integer.toString(i)));
            if (i % 3 == 0) {
                i -= 6;
            }
        }

        numberPad.setLayout(new GridLayout(3,3));
    }

    public JPanel getPanel() {
        return numberPad;
    }



 }