package O3_JavaSwing.Swing.Q488;

import javax.swing.*;

class Calculator extends JFrame {
    Calculator() {
        setSize(500, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

public class Q488 {
    public static void main(String[] args) {
        new Calculator();
    }
}
