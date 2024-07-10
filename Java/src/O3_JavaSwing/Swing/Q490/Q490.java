package O3_JavaSwing.Swing.Q490;

import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
    JButton button;
    JLabel label;

    Calculator() {
        setSize(500, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        button = new JButton();
        button.setText("Button");
        button.setFont(new Font("Ariel", 3, 30));
        add(button);

        label = new JLabel();
        label.setText("This Is A Label");
        label.setFont(new Font("", 1, 30));
        add(label);

        setVisible(true);
    }
}

public class Q490 {
    public static void main(String[] args) {
        new Calculator();
    }
}
