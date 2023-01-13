import java.awt.event.*;
import javax.swing.*;

public class ClickListener implements ActionListener {
    private Calculator calculator;
    private JLabel label;

    public ClickListener(Calculator calculator, JLabel label) {
        this.calculator = calculator;
        this.label = label;
    }

    public void actionPerformed(ActionEvent e) {
        calculator.increase();
        label.setText(String.valueOf(calculator.giveValue()));
    }
}