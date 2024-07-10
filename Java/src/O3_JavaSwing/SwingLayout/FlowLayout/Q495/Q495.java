package O3_JavaSwing.SwingLayout.FlowLayout.Q495;

import javax.swing.*;
import java.awt.*;

class Buttons extends JFrame {
    JButton btnNorth;
    JButton btnEast;
    JButton btnSouth;
    JButton btnWest;
    JButton btnCenter;

    Buttons() {
        setSize(300, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        btnNorth = new JButton();
        btnNorth.setText("North");
        btnNorth.setFont(new Font("Ariel", 3, 30));
        add("North", btnNorth);

        btnEast = new JButton();
        btnEast.setText("East");
        btnEast.setFont(new Font("Ariel", 3, 30));
        add("East", btnEast);

        btnSouth = new JButton();
        btnSouth.setText("South");
        btnSouth.setFont(new Font("Ariel", 3, 30));
        add("South", btnSouth);

        btnWest = new JButton();
        btnWest.setText("West");
        btnWest.setFont(new Font("Ariel", 3, 30));
        add("West", btnWest);

        btnCenter = new JButton();
        btnCenter.setText("Center");
        btnCenter.setFont(new Font("Ariel", 3, 30));
        add("Center", btnCenter);

        setVisible(true);
    }
}

public class Q495 {
    public static void main(String[] args) {
        new Buttons();
    }
}

