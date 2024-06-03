package O12_InterfaceAsAContract.Q615_Example.Q617;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Box extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    Box() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        textField.setFont(new Font("", 1, 25));
        add(textField);

        button = new JButton();
        button.setText("Button");
        button.setFont(new Font("", 1, 25));
        button.addActionListener(this);
        add(button);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String title = textField.getText();
        setTitle(title);
    }
}


public class Q617 {
    public static void main(String[] args) {
        new Box();
    }
}
