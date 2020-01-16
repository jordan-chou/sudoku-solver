import javax.swing.*;
import java.awt.*;

class SudokuSolver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sudoku Solver");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Creating panel
        JPanel sudokuGridPanel = new JPanel(new GridBagLayout());

        // Creating 2D array of TextFields
        JTextField[][] grid = new JTextField[3][3];

        // Setting constraints of GridBag
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.CENTER;
        
        // Adding label and textfield to Panel
        int num = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                constraints.gridx = j;
                constraints.gridy = i;
                grid[i][j] = new JTextField(Integer.toString(num++));
                sudokuGridPanel.add(grid[i][j], constraints);
            }
        }

        frame.getContentPane().add(sudokuGridPanel);
        frame.setVisible(true);
    }
}