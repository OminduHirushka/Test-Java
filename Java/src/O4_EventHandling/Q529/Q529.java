package O4_EventHandling.Q529;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class DisplayWindow extends JFrame {
    private JLabel displayLabel;

    DisplayWindow() {
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setTitle("Display Window");

        displayLabel = new JLabel("50");
        displayLabel.setFont(new Font("", 1, 35));
        add(displayLabel);

        setVisible(true);
    }

    public void setDisplayLabelValue(int waterLevel) {
        this.displayLabel.setText(Integer.toString(waterLevel));
    }
}

class AlarmWindow extends JFrame {
    private JLabel alarmLabel;

    AlarmWindow() {
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setTitle("Alarm Window");

        alarmLabel = new JLabel("Off");
        alarmLabel.setFont(new Font("", 1, 35));
        add(alarmLabel);

        setVisible(true);
    }

    public void setAlarmLabelValue(int waterLevel) {
        this.alarmLabel.setText(waterLevel > 50 ? "On" : "Off");
    }
}

class SplitterWindow extends JFrame {
    private JLabel splitterLabel;

    SplitterWindow() {
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setTitle("Splitter Window");

        splitterLabel = new JLabel("Off");
        splitterLabel.setFont(new Font("", 1, 35));
        add(splitterLabel);

        setVisible(true);
    }

    public void setSplitterLabelValue(int waterLevel) {
        this.splitterLabel.setText(waterLevel > 75 ? "On" : "Off");
    }
}

class WaterTankWindow extends JFrame {
    private JSlider waterLevelSlider;
    private DisplayWindow displayWindow;
    private AlarmWindow alarmWindow;
    private SplitterWindow splitterWindow;

    WaterTankWindow() {
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setTitle("Water Tank Window");

        ////
        this.alarmWindow = new AlarmWindow();
        this.displayWindow = new DisplayWindow();
        this.splitterWindow = new SplitterWindow();
        ////

        waterLevelSlider = new JSlider(JSlider.VERTICAL, 0, 100, 50);
        waterLevelSlider.setMajorTickSpacing(10);
        waterLevelSlider.setPaintLabels(true);

        waterLevelSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int waterLevel = waterLevelSlider.getValue();
                displayWindow.setDisplayLabelValue(waterLevel);
                alarmWindow.setAlarmLabelValue(waterLevel);
                splitterWindow.setSplitterLabelValue(waterLevel);
            }
        });
        add(waterLevelSlider);

        setVisible(true);
    }
}

public class Q529 {
    public static void main(String[] args) {
        new WaterTankWindow();
    }
}
