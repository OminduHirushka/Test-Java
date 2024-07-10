package O3_JavaSwing.Swing.Q482;

import javax.swing.*;
import java.awt.*;

public class Q482 {
    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        f1.setSize(400, 300);
        f1.setTitle("My Frame");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);

        JButton button = new JButton();
        button.setText("Button");
        button.setFont(new Font("Ariel", 3, 30));

        f1.add(button);
        f1.setVisible(true);
    }
}
