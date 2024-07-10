package O3_JavaSwing.SwingLayout.GridLayout.Q497;

import javax.swing.*;
import java.awt.*;

class GriLayout extends JFrame {
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;

    GriLayout() {
        setSize(300, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 2));

        btn1 = new JButton();
        btn1.setText("Button 1");
        btn1.setFont(new Font("", 3, 25));
        add(btn1);

        btn2 = new JButton();
        btn2.setText("Button 2");
        btn2.setFont(new Font("", 3, 25));
        add(btn2);

        btn3 = new JButton();
        btn3.setText("Button 3");
        btn3.setFont(new Font("", 3, 25));
        add(btn3);

        btn4 = new JButton();
        btn4.setText("Button 4");
        btn4.setFont(new Font("", 3, 25));
        add(btn4);

        setVisible(true);
    }
}

public class Q497 {
    public static void main(String[] args) {
        new GriLayout();
    }
}
