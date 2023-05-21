package mye030.DBMS_data_visualization;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.AbstractDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RefineryUtilities;

class ChartDisplay {

  
  static JFrame createScatterPlot() {
	JFrame ScatterPlotFrame = new JFrame("Scatter Plot");
	ScatterPlotFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	ScatterPlotFrame.setLayout(new BorderLayout(0, 5));
	ScatterPlotFrame.add(ScatterPlotPanel(), BorderLayout.CENTER);
	ScatterPlotFrame.pack();
	RefineryUtilities.centerFrameOnScreen(ScatterPlotFrame);
	ScatterPlotFrame.setVisible(true);
	return ScatterPlotFrame;
  }
  
  private static ChartPanel ScatterPlotPanel() {
	  
	JFreeChart scatterPlot = ChartFactory.createScatterPlot("", "", "Birth Rates", createDefaultCategoryDatasetScatterPlot());
	ChartPanel scatterPlotPanel = new ChartPanel(scatterPlot);
	scatterPlotPanel.setPreferredSize(new java.awt.Dimension(450, 550));
	return scatterPlotPanel;
  }
  
  static JFrame createLineChart() {
	JFrame LineChartFrame = new JFrame("Line Chart");
	LineChartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	LineChartFrame.setLayout(new BorderLayout(0, 5));
	LineChartFrame.add(LineChartPanel(), BorderLayout.CENTER);
	LineChartFrame.pack();
	RefineryUtilities.centerFrameOnScreen(LineChartFrame);
	LineChartFrame.setLocation(2500, 1000);
	LineChartFrame.setVisible(true);
	return LineChartFrame;
  }
	  
  private static ChartPanel LineChartPanel() {
		  
	JFreeChart lineChart = ChartFactory.createXYLineChart("", "", "Birth Rates", createDefaultCategoryDatasetScatterPlot());
	XYPlot plot = lineChart.getXYPlot();
	XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
	renderer.setSeriesShapesVisible(0, true); // Show data points as shapes 
	plot.setRenderer(renderer);
	ChartPanel lineChartPanel = new ChartPanel(lineChart);
	lineChartPanel.setPreferredSize(new java.awt.Dimension(450, 550));
	
	return lineChartPanel;
  }
	
  static JFrame createBarChart() {
    JFrame barChartFrame = new JFrame("Bar Chart");
    barChartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    barChartFrame.setLayout(new BorderLayout(0, 5));
    barChartFrame.add(createBarChartPanel(), BorderLayout.CENTER);
    barChartFrame.pack();
    RefineryUtilities.centerFrameOnScreen(barChartFrame);
    barChartFrame.setVisible(true);
    return barChartFrame;
  }

  private static ChartPanel createBarChartPanel() {
    JFreeChart barChart = ChartFactory.createBarChart("", "", "Tax analysis in $",
        createDefaultCategoryDatasetBarChart(), PlotOrientation.VERTICAL,
        true, true, false);
    ChartPanel barChartPanel = new ChartPanel(barChart);
    barChartPanel.setPreferredSize(new java.awt.Dimension(450, 550));
    return barChartPanel;
  }

  private static CategoryDataset createDefaultCategoryDatasetBarChart() {
    DefaultCategoryDataset barChartDataset = new DefaultCategoryDataset();
    
    List<String> s1 = new ArrayList<String>(Arrays.asList("Greece", "2016", "571", "Birth Rate"));
    List<String> s4 = new ArrayList<String>(Arrays.asList("Greece", "2017", "571", "Birth Rate"));
    List<String> s2 = new ArrayList<String>(Arrays.asList("Albania", "2017", "654", "Birth Rate"));
    List<String> s3 = new ArrayList<String>(Arrays.asList("Turkey", "2017", "684", "Birth Rate sad"));
    List<List<String>> temp = new ArrayList<List<String>>(Arrays.asList(s1, s2, s3, s4));

    
    for(List<String> d : temp) {
    	int val = Integer.parseInt(d.get(2));
    	String year = d.get(1);
    	String valueName = d.get(3);
    	String country  = d.get(0);
    	barChartDataset.addValue(val, country, year);//h ka8e grammh 8a einai tou styl xwra year ari8mos onoma 
    }
	  
    return barChartDataset;
  }
  
  private static XYDataset createDefaultCategoryDatasetScatterPlot() {
	  XYSeriesCollection scatterPlotDataset = new XYSeriesCollection();
	  XYSeries series1 = new XYSeries("greece");
	  series1.add(2015, 571);
	  series1.add(2016, 654);
	  series1.add(2017, 684);
	  XYSeries series2 = new XYSeries("albania");
	  series2.add(2015, 984);
	  series2.add(2016, 156);
	  series2.add(2017, 321);
	  series2.add(2018, 984);
	  series2.add(2019, 954);
	  XYSeries series3 = new XYSeries("turkey");
	  series3.add(2015, 959);
	  series3.add(2016, 190);
	  series3.add(2017, 741);
	  scatterPlotDataset.addSeries(series1);
	  scatterPlotDataset.addSeries(series2);
	  scatterPlotDataset.addSeries(series3);
	  return scatterPlotDataset;
  }

}