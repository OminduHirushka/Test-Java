package O4_EventHandling.Q516;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class SliderFrame extends JFrame {
    private JTextField textField;
    private JSlider slider;

    SliderFrame() {
        setSize(250, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        setFont(new Font("", 1, 20));
        add(textField);

        slider = new JSlider(JSlider.VERTICAL, 0, 100, 50);
        slider.setMajorTickSpacing(10);
        slider.setPaintLabels(true);

        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                textField.setText(value + ""); // Integer.toString(value);
            }
        });
        add(slider);

        setVisible(true);
    }
}

public class Q516 {
    public static void main(String[] args) {
        new SliderFrame();
    }
}
