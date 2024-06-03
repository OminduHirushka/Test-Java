package O12_InterfaceAsAContract.InnerClass.AnonymousInnerClass.Q623;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Box extends JFrame {
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

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = textField.getText();
                setTitle(title);
            }
        });
        add(button);

        setVisible(true);
    }
}

public class Q623 {
    public static void main(String[] args) {
        new Box();
    }
}
