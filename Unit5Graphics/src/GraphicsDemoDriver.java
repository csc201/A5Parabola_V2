import java.awt.*;

import javax.swing.JFrame;


public class GraphicsDemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		// set application to full screen
		Toolkit tk = Toolkit.getDefaultToolkit();
		int xSize = ((int) tk.getScreenSize().getWidth());
		int ySize = ((int) tk.getScreenSize().getHeight());
		frame.setPreferredSize(new Dimension(xSize, ySize));
		frame.add(new GraphicsDemo());
		frame.setVisible(true);
		frame.pack();
		
		
	}

}
