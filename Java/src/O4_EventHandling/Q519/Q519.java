package O4_EventHandling.Q519;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class SliderFrame extends JFrame {
    private JSlider slider;
    private DisplayFrame displayFrame;

    SliderFrame(DisplayFrame displayFrame) {
        this.displayFrame = displayFrame;
        setSize(250, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        slider = new JSlider(JSlider.VERTICAL, 0, 100, 50);
        slider.setMajorTickSpacing(10);
        slider.setPaintLabels(true);

        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                displayFrame.textField.setText(Integer.toString(value));
            }
        });
        add(slider);

        setVisible(true);
    }
}

class DisplayFrame extends JFrame {
    JTextField textField;

    DisplayFrame() {
        setSize(250, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        textField.setFont(new Font("", 1, 20));
        add(textField);
        setVisible(true);
    }
}

public class Q519 {
    public static void main(String[] args) {
        DisplayFrame displayFrame = new DisplayFrame();
        new SliderFrame(displayFrame);
    }
}
