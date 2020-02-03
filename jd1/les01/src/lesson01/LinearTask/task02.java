/* Найдите значение функции: с = 3 + а
*/

package by.htp.les01.main; 
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
    public class task02 
    {
    public static void main(String[] args) {
    XYSeries series = new XYSeries("c=3+a");
    for(float i = 0; i < Math.PI; i+=0.1)
    {
      series.add(i, i = i+3);
    }
    XYDataset xyDataset = new XYSeriesCollection(series);
    JFreeChart chart = ChartFactory
        .createXYLineChart("c=3+a", "a", "c",
                           xyDataset, 
                           PlotOrientation.VERTICAL,
                           true, true, true);
    JFrame frame = 
        new JFrame("MinimalStaticChart");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Помещаем график на фрейм
    frame.getContentPane()
        .add(new ChartPanel(chart));
    frame.setSize(400,300);
    frame.show();
  }
}
  

        
        
   

 
