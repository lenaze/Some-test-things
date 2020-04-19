import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input: ");
    private JRadioButton radioButton1 = new JRadioButton("Select this: ");
    private JRadioButton radioButton2 = new JRadioButton("Select that: ");
    private JCheckBox checkBox = new JCheckBox("Check: ", false);

    public SimpleGUI() throws HeadlessException {
        super("Simple Example");
        //Size of the form
        this.setBounds(100,100,250,100);
        //Close the form
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 3, 3));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        container.add(radioButton1);
        radioButton1.setSelected(false);
        container.add(radioButton2);

        container.add(checkBox);

        button.addActionListener(new ButtonEventListeners());
        container.add(button);
    }

    class ButtonEventListeners implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            String message = "";
            message += "Button was pressed\n";
            message += "Text is: " + input.getText() + "\n";
            message += (radioButton1.isSelected() ? "Radio Button #1" : "Radio Button #2") + " is seleted!\n";
            message += "CheckBox: " + (checkBox.isSelected() ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE );
        }
    }
}
