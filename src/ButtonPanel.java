/*
 * Jordan Chou
 * 
 * github.com/jordan-chou
 * 
 * Defines the class that holds the buttons in a panel
 */

 import javax.swing.JPanel;
 import javax.swing.JButton;
 import java.awt.Dimension;
 import java.awt.GridLayout;

 public class ButtonPanel {
    private final int BUTTON_WIDTH = 80;
    private final int BUTTON_HEIGHT = 40;
    private JPanel buttonPanel;

    public ButtonPanel() {
        buttonPanel = new JPanel();
        
        JPanel buttons = new JPanel();
        JButton solveButton = new JButton("Solve");
        JButton newgameButton = new JButton("New Game");
        JButton quitButton = new JButton("Quit");

        NumberPad numpad = new NumberPad();

        // Solve Button
        solveButton.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));

        // New Game Button
        newgameButton.setPreferredSize(new Dimension(BUTTON_WIDTH+(BUTTON_WIDTH/2), BUTTON_HEIGHT));

        // Quit Button
        quitButton.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        quitButton.addActionListener(e -> System.exit(0));  // Exit functionality

        buttons.add(solveButton);
        buttons.add(newgameButton);
        buttons.add(quitButton);

        buttonPanel.add(buttons);
        buttonPanel.add(numpad.getPanel());
        buttonPanel.setLayout(new GridLayout(2,1));
    }


    public JPanel getPanel() {
        return buttonPanel;
    }

 }