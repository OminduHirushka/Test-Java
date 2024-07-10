package O3_JavaSwing.SwingLayout;

import javax.swing.*;
import java.awt.*;

class JvSwing1 extends JFrame {
    JButton btnHeader;
    JButton btnFooter;
    JButton btnRSideNav;
    JButton btnLSideNav;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;

    JvSwing1() {
        setSize(500, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Font font = new Font("", 1, 20);

        setLayout(new BorderLayout());

        btnHeader = new JButton("Header");
        btnHeader.setFont(font);
        add("North", btnHeader);

        btnFooter = new JButton("Footer");
        btnFooter.setFont(font);
        add("South", btnFooter);

        btnRSideNav = new JButton("Side Nav");
        btnRSideNav.setFont(font);
        add("East", btnRSideNav);

        btnLSideNav = new JButton("Side Nav");
        btnLSideNav.setFont(font);
        add("West", btnLSideNav);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2));

        btn1 = new JButton("1");
        btn1.setFont(font);
        centerPanel.add(btn1);

        btn2 = new JButton("2");
        btn2.setFont(font);
        centerPanel.add(btn2);

        btn3 = new JButton("3");
        btn3.setFont(font);
        centerPanel.add(btn3);

        btn4 = new JButton("4");
        btn4.setFont(font);
        centerPanel.add(btn4);

        add("Center", centerPanel);

        setVisible(true);
    }
}

public class Q500 {
    public static void main(String[] args) {
        new JvSwing1();
    }
}
