import javax.swing.*;
import java.awt.*;

class SudokuSolver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sudoku Solver");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Creating panel
        JPanel sudokuGridPanel = new JPanel(new BorderLayout());

        // Creating label with textfield
        JLabel label = new JLabel("Enter number:");
        JTextField number = new JTextField(5);

        // Adding label and textfield to Panel
        sudokuGridPanel.add(label, BorderLayout.NORTH);
        sudokuGridPanel.add(number, BorderLayout.SOUTH);

        frame.getContentPane().add(sudokuGridPanel);
        frame.setVisible(true);
    }
}