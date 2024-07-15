package O3_JavaSwing.JavaMenu.Q511;

import java.awt.*;
import javax.swing.*;

class Notepad extends JFrame{
    TextArea textArea;
    Notepad(){
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Untitled");
        setLocationRelativeTo(null);

        textArea = new TextArea();
        textArea.setFont(new Font("", 1, 15));
        add("Center", textArea);

        setVisible(true);
    }
}

public class Q511 {
    public static void main(String[] args) {
        new Notepad();
    }
}
