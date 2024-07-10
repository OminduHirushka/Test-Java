package O3_JavaSwing.SwingLayout;

import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
    JButton[] btnArray;
    JTextField textField;

    Calculator() {
        setSize(300, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("", 1, 25));
        add("North", textField);

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(4, 4));
        btnArray = new JButton[16];

        String ar[] = {"7", "8", "9", "*", "4", "5", "6", "/", "1", "2", "3", "+", "0", ".", "=", "-"};

        for (int i = 0; i < 16; i++) {
            btnArray[i] = new JButton(ar[i]);
            btnArray[i].setFont(new Font("", 3, 20));
            btnPanel.add(btnArray[i]);
        }

        add("Center", btnPanel);

        setVisible(true);
    }
}

public class Q502 {
    public static void main(String[] args) {
        new Calculator();
    }
}
