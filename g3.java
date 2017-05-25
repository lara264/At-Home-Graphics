 
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class g3 extends JPanel{
	
	public g3() {
		super();
	}
	
	public Color getRandomColor() {
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		
		return new Color(r, g, b);
	}
	
	public void paintComponent(Graphics g) {
		int w = getWidth();
		int h = getHeight();
		
		g.setColor(getRandomColor());
		
		g.drawLine(10, 10, 200, 200);
		
		for(int x = 0; x < 400; x++) {
			for(int y = 0; y < 400; y++) {
				g.setColor(getRandomColor());
				g.drawLine(0, 0, x, y);
			}
		}
		
		
		
		//loopColors(g, 20, 20, 200, 200);
	}
	
	/*
	 * loopColors is broken 
	public void loopColors(Graphics g, int x, int upToX, int y, int downToY) {
		g.setColor(getRandomColor());
		
		for(int i = x; i < upToX; i++) {
			for(int j = y; y < downToY; j++) {
				int[] xA = {i};
				int[] yA = {j};
				
				g.drawLine(x, y, i, j);
			}
		}
	}
	*/

	public static void main(String[] arrrgs) {
		JFrame frame = new JFrame("g3");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		
		g3 panel = new g3();
		//panel.setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.DARK_GRAY);
		frame.setContentPane(panel);
		frame.setVisible(true);
	}

}

