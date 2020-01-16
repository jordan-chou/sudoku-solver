/*
 * Jordan Chou
 * 
 * github.com/jordan-chou
 * 
 * Main program
 */

import javax.swing.*;
import java.awt.FlowLayout;

class SudokuSolver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sudoku Solver");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);

        SudokuPanel sudokuPanel = new SudokuPanel();

        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        leftPanel.add(sudokuPanel.getPanel());

        frame.getContentPane().add(leftPanel);
        frame.setVisible(true);
    }
}