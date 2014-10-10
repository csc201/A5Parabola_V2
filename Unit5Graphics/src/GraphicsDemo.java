import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;


public class GraphicsDemo extends JPanel {
	public void paint(Graphics g) {
		//draw the triangle top points upward
		Polygon p = new Polygon();
		/*int []xPoints = {0,100,100,0};
		int []yPoints = {0,0,100,100};
		g.drawPolygon(xPoints, yPoints, 4);*/
		double scaleFactor = 0.1;
		for (int x=-100; x<=100; x++) {
		 p.addPoint(x+200, 200- (int)(scaleFactor *x *x));
		}
		g.drawPolygon(p);
		/*g.drawLine(5, 5, 100, 100);
		g.drawString("Test", 100, 100);
		g.drawOval(100, 100, 50, 50);
		*/
	}
}
