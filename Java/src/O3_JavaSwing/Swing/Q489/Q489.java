package O3_JavaSwing.Swing.Q489;

import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
    JButton button;

    Calculator() {
        setSize(500, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        button = new JButton();
        button.setText("Button");
        button.setFont(new Font("Ariel", 3, 30));

        add(button);
        setVisible(true);
    }
}

public class Q489 {
    public static void main(String[] args) {
        new Calculator();
    }
}
