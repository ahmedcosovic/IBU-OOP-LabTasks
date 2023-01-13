import java.awt.*;
import javax.swing.*;

public class UserInterface extends JFrame {
    private JButton clickButton;
    private JLabel displayLabel;

    public UserInterface(Calculator calculator) {
        setTitle("Clicker");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Initialize components
        clickButton = new JButton("Click!");
        displayLabel = new JLabel("0");

        // Add action listener to button
        clickButton.addActionListener(new ClickListener(calculator, displayLabel));

        // Set layout manager
        setLayout(new BorderLayout());

        // Add components to frame
        add(clickButton, BorderLayout.CENTER);
        add(displayLabel, BorderLayout.SOUTH);
    }
}