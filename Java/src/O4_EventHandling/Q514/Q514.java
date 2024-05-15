package O4_EventHandling.Q514;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventTest extends JFrame {
    JButton button;

    EventTest() {
        setSize(500, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        button = new JButton();
        button.setText("Button");
        button.setFont(new Font("", 1, 25));

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed a button");
            }
        });
        add(button);

        setVisible(true);
    }
}

public class Q514 {
    public static void main(String[] args) {
        new EventTest();
    }
}
