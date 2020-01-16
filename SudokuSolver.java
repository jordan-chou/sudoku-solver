/*
 * Jordan Chou
 * 
 * github.com/jordan-chou
 * 
 * Main program
 */

import javax.swing.*;

class SudokuSolver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sudoku Solver");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        SudokuPanel sudokuPanel = new SudokuPanel();

        frame.getContentPane().add(sudokuPanel.getPanel());
        frame.setVisible(true);
    }
}