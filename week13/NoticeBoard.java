import javax.swing.*;
import java.awt.*;

public class NoticeBoard {
    private JFrame frame;
    private JButton button;
    private JLabel label;

    private void createComponents(Container container){
        container.add(new JTextField());
        JButton copyButton = new JButton("Copy!");
        container.add(copyButton);
    }

    public void start(){
        this.frame = new JFrame();
        this.frame.setSize(500, 300);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
        this.frame.setLayout(new GridLayout(3,1));
        this.createComponents(this.frame);
    }
}
