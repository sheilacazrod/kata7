package software.ulpgc.kata7.swing;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import software.ulpgc.kata7.Chart;
import software.ulpgc.kata7.ChartDisplay;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class JpanelDisplay extends JPanel implements ChartDisplay {
    @Override
    public void show(Chart chart) {
        ChartPanel chartPanel = new ChartPanel(charOf(chart));
        chartPanel.setPreferredSize(new Dimension(1000,1000));
        add(chartPanel);
    }

    private JFreeChart charOf(Chart chart) {
        return ChartFactory.createBarChart(chart.title(), chart.xAxis(), chart.yAxis(),toDataSet(chart.data()));

    }

    private CategoryDataset toDataSet(Map<String, Integer> data) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String key : data.keySet()){
            dataset.addValue(data.get(key),"Juegos Vendidos",key );

        }
        return dataset;
    }
}
