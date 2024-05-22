package O4_EventHandling.Q549;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class WaterLevelObserver extends JFrame {
    public void update(int waterLevel) {

    }
}

class DisplayWindow extends WaterLevelObserver {
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

    public void update(int waterLevel) {
        this.displayLabel.setText(Integer.toString(waterLevel));
    }
}

class AlarmWindow extends WaterLevelObserver {
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

    public void update(int waterLevel) {
        this.alarmLabel.setText(waterLevel > 50 ? "On" : "Off");
    }
}

class SplitterWindow extends WaterLevelObserver {
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

    public void update(int waterLevel) {
        this.splitterLabel.setText(waterLevel > 75 ? "On" : "Off");
    }
}

class WaterTankController {
    private WaterLevelObserver[] observer = new WaterLevelObserver[0];
    private int waterLevel;

    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver) {
        WaterLevelObserver[] temp = new WaterLevelObserver[observer.length + 1];
        for (int i = 0; i < observer.length; i++) {
            temp[i] = observer[i];
        }
        temp[temp.length - 1] = waterLevelObserver;
        observer = temp;
    }

    public void setWaterLevel(int waterLevel) {
        if (this.waterLevel != waterLevel) {
            this.waterLevel = waterLevel;
            notifyObject();
        }
    }

    public void notifyObject() {
        for (WaterLevelObserver waterLevelObserver : observer) {
            waterLevelObserver.update(waterLevel);
        }
    }
}

class WaterTankWindow extends JFrame {
    private JSlider waterLevelSlider;
    private WaterTankController waterTankController;

    WaterTankWindow(WaterTankController waterTankController) {
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        setTitle("Water Tank Window");

        this.waterTankController = waterTankController;

        waterLevelSlider = new JSlider(JSlider.VERTICAL, 0, 100, 50);
        waterLevelSlider.setMajorTickSpacing(10);
        waterLevelSlider.setPaintLabels(true);

        waterLevelSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int waterLevel = waterLevelSlider.getValue();
                waterTankController.setWaterLevel(waterLevel);
            }
        });
        add(waterLevelSlider);

        setVisible(true);
    }
}

public class Q549 {
    public static void main(String[] args) {
        WaterTankController waterTankController = new WaterTankController();
        waterTankController.addWaterLevelObserver(new AlarmWindow());
        waterTankController.addWaterLevelObserver(new DisplayWindow());
        waterTankController.addWaterLevelObserver(new SplitterWindow());

        WaterTankWindow waterTankWindow = new WaterTankWindow(waterTankController);
    }
}
