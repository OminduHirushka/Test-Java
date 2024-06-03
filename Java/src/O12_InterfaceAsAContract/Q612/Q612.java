package O12_InterfaceAsAContract.Q612;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Box extends JFrame {
    JButton button;

    Box() {
        setSize(300, 300);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        button = new JButton();
        button.setText("Button");
        button.setFont(new Font("", 1, 25));
        // button.add(new MyClass());                           // Illegal
        // button.addActionListener(new MyClass());             // Illegal
        add(button);

        setVisible(true);
    }
}

class MyClass {
    public void myMethod() {
        System.out.println("You pressed the button");
    }
}

public class Q612 {
    public static void main(String[] args) {
        new Box();
    }
}
