package mye030.DBMS_data_visualization;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
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

  
  static JFrame createScatterPlot(List<List<List<String>>> Data,List<String> selectedCountries,String xAxis,String yAxis) {
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int screenWidth = screenSize.width;
    int screenHeight = screenSize.height;
    int leftWindowX = (screenWidth/2) - 450;
    int leftWindowY = (screenHeight/2)-250;
	JFrame ScatterPlotFrame = new JFrame("Scatter Plot");
	ScatterPlotFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	ScatterPlotFrame.setLayout(new BorderLayout(0, 5));
	ScatterPlotFrame.add(ScatterPlotPanel(Data,selectedCountries,xAxis,yAxis), BorderLayout.CENTER);
	ScatterPlotFrame.pack();
	RefineryUtilities.centerFrameOnScreen(ScatterPlotFrame);
	ScatterPlotFrame.setLocation(leftWindowX, leftWindowY);
	ScatterPlotFrame.setVisible(true);
	return ScatterPlotFrame;
  }
  
  private static ChartPanel ScatterPlotPanel(List<List<List<String>>> Data,List<String> selectedCountries,String xAxis,String yAxis) {
	  
	JFreeChart scatterPlot = ChartFactory.createScatterPlot("", xAxis, yAxis, createDefaultCategoryDatasetScatterPlot(Data,selectedCountries));
	ChartPanel scatterPlotPanel = new ChartPanel(scatterPlot);
	scatterPlotPanel.setPreferredSize(new java.awt.Dimension(450, 550));
	return scatterPlotPanel;
  }
  
  static JFrame createLineChart(List<List<List<String>>> Data,List<String> selectedCountries,String xAxis,String yAxis) {
	JFrame LineChartFrame = new JFrame("Line Chart");
	LineChartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	LineChartFrame.setLayout(new BorderLayout(0, 5));
	LineChartFrame.add(LineChartPanel(Data,selectedCountries,xAxis,yAxis), BorderLayout.CENTER);
	LineChartFrame.pack();
	RefineryUtilities.centerFrameOnScreen(LineChartFrame);
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = screenSize.width;
    int screenHeight = screenSize.height;
    int rightWindowX = (screenWidth/2)+450;
    int rightWindowY = (screenHeight/2)-250;
    LineChartFrame.setLocation(rightWindowX, rightWindowY);
	LineChartFrame.setVisible(true);
	return LineChartFrame;
  }
	  
  private static ChartPanel LineChartPanel(List<List<List<String>>> Data,List<String> selectedCountries,String xAxis,String yAxis) {
		  
	JFreeChart lineChart = ChartFactory.createXYLineChart("", xAxis, yAxis, createDefaultCategoryDatasetScatterPlot(Data,selectedCountries));
	XYPlot plot = lineChart.getXYPlot();
	XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
	renderer.setSeriesShapesVisible(0, true); // Show data points as shapes 
	plot.setRenderer(renderer);
	ChartPanel lineChartPanel = new ChartPanel(lineChart);
	lineChartPanel.setPreferredSize(new java.awt.Dimension(450, 550));
	
	return lineChartPanel;
  }
	
  static JFrame createBarChart(List<List<List<String>>> Data,String xAxis,String yAxis) {
    JFrame barChartFrame = new JFrame("Bar Chart");
    barChartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    barChartFrame.setLayout(new BorderLayout(0, 5));
    barChartFrame.add(createBarChartPanel(Data,xAxis,yAxis), BorderLayout.CENTER);
    barChartFrame.pack();
    RefineryUtilities.centerFrameOnScreen(barChartFrame);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = screenSize.width;
    int screenHeight = screenSize.height;
    int centerWindowX = (screenWidth/2);
    int centerWindowY = (screenHeight/2)-250;
    barChartFrame.setLocation(centerWindowX, centerWindowY);
    barChartFrame.setVisible(true);
    return barChartFrame;
  }

  private static ChartPanel createBarChartPanel(List<List<List<String>>> Data,String xAxis,String yAxis) {
    JFreeChart barChart = ChartFactory.createBarChart("", "", yAxis+", "+xAxis,
    		createDefaultCategoryDatasetBarChart(Data), PlotOrientation.VERTICAL,
        true, true, false);
    ChartPanel barChartPanel = new ChartPanel(barChart);
    barChartPanel.setPreferredSize(new java.awt.Dimension(450, 550));
    return barChartPanel;
  }

  private static CategoryDataset createDefaultCategoryDatasetBarChart(List<List<List<String>>> Data) {
    DefaultCategoryDataset barChartDataset = new DefaultCategoryDataset();

    List<List<String>> temp = new ArrayList<>();
    
    for (List<List<String>> lst : Data) {
    	for (List<String> line : lst) {
    		List<String> s = new ArrayList<String>(Arrays.asList(line.get(0), line.get(1), line.get(2), line.get(3)));
    		temp.add(s);
    	}
    }
    
    for(List<String> d : temp) {
    	float val = Float.parseFloat(d.get(2));
    	String year = d.get(1);
    	String valueName = d.get(3);
    	String country  = d.get(0);
    	System.out.println(val+" "+country+" "+year);
    	barChartDataset.addValue(val, country+" "+valueName, year);//h ka8e grammh 8a einai tou styl xwra year ari8mos onoma 
    }
	  
    return barChartDataset;
  }
  
  private static XYDataset createDefaultCategoryDatasetScatterPlot(List<List<List<String>>> Data,List<String> selectedCountries) {
	  XYSeriesCollection scatterPlotDataset = new XYSeriesCollection();
	  
	  for (String country : selectedCountries) {
		  XYSeries series1 = new XYSeries(country);
		  List<List<String>> temp = Data.get(0);
		  List<List<String>> Xlst = new ArrayList<>();
		  for (List<String> row : temp) {
			 if (row.get(0).equals(country)) {
				 Xlst.add(row);
			 }
		  }
		  
		  temp = Data.get(1);
		  List<List<String>> Ylst = new ArrayList<>();
		  for (List<String> row : temp) {
			 if (row.get(0).equals(country)) {
				 Ylst.add(row);
			 }
		  }
		  
		  for (List<String> lineX : Xlst) {
			  for (List<String> lineY : Ylst) {
				  if (lineX.get(1).equals(lineY.get(1))) {
					  series1.add(Float.parseFloat(lineX.get(2)),Float.parseFloat(lineY.get(2)));
					  System.out.println(country+" "+lineX.get(2)+" "+lineY.get(2));
				  }
			  }
			  
		  }
		  scatterPlotDataset.addSeries(series1);
	  }
		  
	  
	  return scatterPlotDataset;
  }

}