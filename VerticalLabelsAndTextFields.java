import javax.swing.*;

public class VerticalLabelsAndTextFields {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label1 = new JLabel("Label 1:");
        JTextField textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Label 2:");
        JTextField textField2 = new JTextField(10);
        JLabel label3 = new JLabel("Label 3:");
        JTextField textField3 = new JTextField(10);

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}