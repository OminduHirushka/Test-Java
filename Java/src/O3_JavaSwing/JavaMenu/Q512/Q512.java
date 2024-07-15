package O3_JavaSwing.JavaMenu.Q512;

import java.awt.*;
import javax.swing.*;

class Notepad extends JFrame{
    TextArea textArea;

    JMenuBar mainMenu;
    JMenu fileMenu, editMenu, viewMenu;
    JMenuItem item1, item2, item3, item4, item5, item6;

    Notepad(){
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Untitled");
        setLocationRelativeTo(null);

        mainMenu = new JMenuBar();

        //
        fileMenu = new JMenu("File");
        item1 = new JMenuItem("Item 1");
        fileMenu.add(item1);

        item2 = new JMenuItem("Item 2");
        fileMenu.add(item2);

        mainMenu.add(fileMenu);

        //
        editMenu = new JMenu("Edit");
        item3 = new JMenuItem("Item 3");
        editMenu.add(item3);

        item4 = new JMenuItem("Item 4");
        editMenu.add(item4);

        mainMenu.add(editMenu);

        setJMenuBar(mainMenu);

        textArea = new TextArea();
        textArea.setFont(new Font("", 1, 15));

        JScrollPane jScrollPane = new JScrollPane(textArea);
        add("Center", jScrollPane);

        setVisible(true);
    }
}

public class Q512 {
    public static void main(String[] args) {
        new Notepad();
    }
}
