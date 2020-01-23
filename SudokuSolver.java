/*
 * Jordan Chou
 * 
 * github.com/jordan-chou
 * 
 * Main program
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;

class SudokuSolver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sudoku Solver");
     

        SudokuPanel sudokuPanel = new SudokuPanel();
        ButtonPanel buttonPanel = new ButtonPanel();

        // Creating Game Board 
        JPanel gameBoard = new JPanel();
        gameBoard.add(sudokuPanel.getPanel());
        gameBoard.setLayout(new BoxLayout(gameBoard, BoxLayout.Y_AXIS));    // Centers the vertical alignment

        // Creating Button Panel
        JPanel rightPanel = new JPanel();
        rightPanel.add(buttonPanel.getPanel());
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));  // Centers the vertical alignment


        
        frame.getContentPane().add(gameBoard);
        frame.getContentPane().add(rightPanel);
        frame.setLayout(new GridLayout(1,2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setVisible(true);
    }
}