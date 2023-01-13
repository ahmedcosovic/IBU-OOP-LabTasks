import java.awt.*;
import javax.swing.*;

public class NoticeBoard extends JFrame {
    private JTextField textField;
    private JButton submitButton;
    private JLabel displayLabel;

    public NoticeBoard() {
        setTitle("Notice Board");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textField = new JTextField();
        submitButton = new JButton("Copy!");
        displayLabel = new JLabel();

        submitButton.addActionListener(new ActionEventListener(textField, displayLabel));

        setLayout(new GridLayout(3, 1));

        add(textField);
        add(submitButton);
        add(displayLabel);
    }
}