/*
 * Jordan Chou
 * 
 * github.com/jordan-chou
 * 
 * Defines one 3x3 grid. The SudokuPanel will have 9 of these
 */

 import javax.swing.*; 
 import java.awt.*; 

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
                numbers[i][j] = new JTextField(Integer.toString(num++));
                grid.add(numbers[i][j], constraints);
            }
        }
     }

    public JPanel getGrid() {
        return grid;
    }
 }