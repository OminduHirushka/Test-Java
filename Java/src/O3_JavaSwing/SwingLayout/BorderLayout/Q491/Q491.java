package O3_JavaSwing.SwingLayout.BorderLayout.Q491;

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
        setLayout(new BorderLayout());

        button = new JButton();
        button.setText("Button");
        button.setFont(new Font("Ariel", 3, 30));
        add("North", button);

        label = new JLabel();
        label.setText("This Is A Label");
        label.setFont(new Font("", 1, 30));
        add("South", label);

        setVisible(true);
    }
}

public class Q491 {
    public static void main(String[] args) {
        new Calculator();
    }
}
