package O12_InterfaceAsAContract.MouseListenerVsMouseEvent;

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
        button.addMouseListener(new MyClass());
        add(button);

        setVisible(true);
    }
}

class MyClass implements MouseListener {
    public void mouseClicked(MouseEvent evt) {
        System.out.println("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent evt) {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent evt) {
        System.out.println("Mouse Exited");
    }

    public void mousePressed(MouseEvent evt) {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent evt) {
        System.out.println("Mouse Released");
    }
}

public class Q614 {
    public static void main(String[] args) {
        new Box();
    }
}
