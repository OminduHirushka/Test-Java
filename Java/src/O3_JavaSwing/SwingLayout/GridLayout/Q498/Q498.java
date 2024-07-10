package O3_JavaSwing.SwingLayout.GridLayout.Q498;

import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
    JButton[] btnArray;

    Calculator() {
        setSize(300, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 4));

        btnArray = new JButton[16];

        String ar[] = {"7", "8", "9", "*", "4", "5", "6", "/", "1", "2", "3", "+", "0", ".", "=", "-"};

        for (int i = 0; i < 16; i++) {
            btnArray[i] = new JButton(ar[i]);
            btnArray[i].setFont(new Font("", 3, 20));
            add(btnArray[i]);
        }
        setVisible(true);
    }
}

public class Q498 {
    public static void main(String[] args) {
        new Calculator();
    }
}
