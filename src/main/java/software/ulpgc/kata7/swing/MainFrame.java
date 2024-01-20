package software.ulpgc.kata7.swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JpanelDisplay ChartDisplay;

    public MainFrame() throws HeadlessException {
        setTitle("Plataformas de los juegos más vendidos");
        setSize(1000,1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(createChartDisplay());
    }

    private Component createChartDisplay() {
        JpanelDisplay jpanelDisplay = new JpanelDisplay();
        this.ChartDisplay = jpanelDisplay;
        return jpanelDisplay;
    }

    public JpanelDisplay getChartDisplay(){
        return this.ChartDisplay;
    }
}
