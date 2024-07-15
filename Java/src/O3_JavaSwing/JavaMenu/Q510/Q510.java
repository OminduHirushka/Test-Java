package O3_JavaSwing.JavaMenu.Q510;

import javax.swing.*;

class Notepad extends JFrame{
    Notepad(){
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Untitled");
        setLocationRelativeTo(null);

        setVisible(true);
    }
}

public class Q510 {
    public static void main(String[] args) {
        new Notepad();
    }
}
