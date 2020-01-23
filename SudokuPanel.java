/*
 * Jordan Chou
 * 
 * github.com/jordan-chou
 * 
 * Defines the class that holds grids and display of grids
 */

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Color;

public class SudokuPanel {
    private JPanel sudokuPanel;

    public SudokuPanel() {
        JPanel thisGrid;

        // Creating panel
        sudokuPanel = new JPanel(new GridBagLayout());

        // Creating 2D array of Grids
        Grid[][] grid = new Grid[3][3];

        // Setting constraints of GridBag
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.CENTER;
        
        // Adding label and textfield to Panel
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                constraints.gridx = j;
                constraints.gridy = i;
                grid[i][j] = new Grid();
                thisGrid = grid[i][j].getGrid();

                thisGrid.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                sudokuPanel.add(thisGrid, constraints);
            }
        }
    }

    public JPanel getPanel() {
        return sudokuPanel;
    }
}