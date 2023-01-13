import java.awt.event.*;
import javax.swing.*;

public class ActionEventListener implements ActionListener {
    private JTextField textField;
    private JLabel displayLabel;

    public ActionEventListener(JTextField textField, JLabel displayLabel) {
        this.textField = textField;
        this.displayLabel = displayLabel;
    }

    public void actionPerformed(ActionEvent e) {
        displayLabel.setText(textField.getText());
        textField.setText("");
    }
}