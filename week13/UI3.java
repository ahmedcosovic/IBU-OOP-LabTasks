import javax.swing.*;
import java.awt.*;

public class UI3 {
    private JFrame frame;
    private JLabel label;
    private JRadioButton radioButton;
    private JCheckBox checkBox;
    private JButton button;
    private ButtonGroup radioButtons = new ButtonGroup();

    public void run() {
        this.frame = new JFrame("Survey");
        this.frame.setSize(200, 300);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
        this.frame.setLayout(new BoxLayout(this.frame.getContentPane(),BoxLayout.Y_AXIS));
        createComponents(this.frame);
    }

    private void createComponents(Container container){

        ButtonGroup radioButtons = new ButtonGroup();

        JLabel labelAreYou = new JLabel("Are you?");
        container.add(labelAreYou);

        JCheckBox checkBoxYes = new JCheckBox("Yes!");
        container.add(checkBoxYes);

        JCheckBox checkBoxNo = new JCheckBox("No!");
        container.add(checkBoxNo);

        JLabel labelWhy = new JLabel("Why?");
        container.add(labelWhy);

        JRadioButton rbNoReason = new JRadioButton("No reason.");
        container.add(rbNoReason);
        radioButtons.add(rbNoReason);

        JRadioButton rbItsFun = new JRadioButton("Because it's fun!");
        container.add(rbItsFun);
        radioButtons.add(rbItsFun);

        JButton buttonDone = new JButton("Done!");
        container.add(buttonDone);
    }
}
