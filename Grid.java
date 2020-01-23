/*
 * Jordan Chou
 * 
 * github.com/jordan-chou
 * 
 * Defines one 3x3 grid. The SudokuPanel will have 9 of these
 */

 import javax.swing.JPanel;
 import javax.swing.JTextField;
 import java.awt.Font;
 import java.awt.Dimension; 
 import java.awt.GridBagConstraints;
 import java.awt.GridBagLayout;
 import java.awt.Color; 

 public class Grid {
    private JPanel grid;

     public Grid() {
        // Creating panel
        grid = new JPanel(new GridBagLayout());

        // Creating 2D array of TextFields
        JTextField[][] numbers = new JTextField[3][3];

        // Setting constraints of GridBag
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.CENTER;
        
        // Adding label and textfield to Panel
        int num = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                constraints.gridx = j;
                constraints.gridy = i;

                // Setting behavior of the square
                numbers[i][j] = new JTextField(Integer.toString(num++));
                numbers[i][j].setEditable(false);
                numbers[i][j].setPreferredSize(new Dimension(30,30));
                numbers[i][j].setHorizontalAlignment(JTextField.CENTER);

                // Setting apperance of the square
                numbers[i][j].setBackground(Color.WHITE);   // Sets to WHITE background
                numbers[i][j].setFont(numbers[i][j].getFont().deriveFont(Font.BOLD, 14f));  // Sets to BOLD and size 14, using the current style

                grid.add(numbers[i][j], constraints);
            }
        }
     }

    public JPanel getGrid() {
        return grid;
    }
 }