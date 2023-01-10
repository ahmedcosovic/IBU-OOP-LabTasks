import javax.swing.*;
import java.awt.*;

public class UI2 {
    private JFrame frame;
    private JLabel label;

    public void run() {
        frame = new JFrame("Swing on");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.setVisible(true);
    }

    public void createComponents(Container container) {
        container.setLayout(new FlowLayout());
        label = new JLabel("Hi!");
        container.add(label);
    }
}
