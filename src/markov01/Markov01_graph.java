package markov01;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Markov01_graph extends Frame implements ActionListener,WindowListener{

	public Markov01_graph(double size, int n, int t, double[] result) {
		addWindowListener(this);
		setTitle("graph");
		
		XYSeriesCollection trace = new XYSeriesCollection();
		XYSeries series = new XYSeries("再帰確率");
		
		
		DefaultCategoryDataset data = new DefaultCategoryDataset();
		int size_count = 0;
		for(double i = 0; i <= 1.0; i += size) {
			series.add(i, result[size_count++]);
		}
		trace.addSeries(series);

	    JFreeChart chart = 
	      ChartFactory.createXYLineChart("再帰確率値(最大ステップ数："+ n +"繰り返し回数："+ t +")",
	                                   "確率",
	                                   "再帰確率",
	                                   trace,
	                                   PlotOrientation.VERTICAL,
	                                   true,
	                                   false,
	                                   false);

	    ChartPanel cpanel = new ChartPanel(chart);
	    add(cpanel, BorderLayout.CENTER);
	    
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
