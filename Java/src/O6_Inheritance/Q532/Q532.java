package O6_Inheritance.Q532;

import javax.swing.*;

class Calculator extends JFrame {
    // This is a JFrame.
}

public class Q532 {
    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setTitle("Frame");
        f1.setVisible(true);

        Calculator c1 = new Calculator();
        c1.setSize(300, 300);
        c1.setTitle("Calculator");
        c1.setVisible(true);
    }
}
