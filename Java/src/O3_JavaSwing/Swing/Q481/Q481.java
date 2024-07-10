package O3_JavaSwing.Swing.Q481;

import javax.swing.*;

public class Q481 {
    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        f1.setSize(400, 300);
        f1.setTitle("Test 1 window");
        f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);

        JFrame f2 = new JFrame();
        f2.setSize(700, 600);
        f2.setTitle("Test 2 window");
        f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f2.setLocationRelativeTo(null);
        f2.setVisible(true);
    }
}

//  JFrame.EXIT_ON_CLOSE = 3
//  JFrame.DISPOSE_ON_CLOSE = 2
//  JFrame.HIDE_ON_CLOSE = 1
//  JFrame.DO_NOTHING_ON_CLOSE = 0
