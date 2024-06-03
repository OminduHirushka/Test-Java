package O12_InterfaceAsAContract.Q615_Example.Q624;

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

        /*
        ActionListener ob = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = textField.getText();
                setTitle(title);
            }
        };
        */

        ActionListener ob = (e) -> {
            String title = textField.getText();
            setTitle(title);
        };
        button.addActionListener(ob);
        add(button);

        setVisible(true);
    }
}

public class Q624 {
    public static void main(String[] args) {
        new Box();
    }
}
