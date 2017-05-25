 

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThisWorksDoNotMessUp extends JPanel{
	
	public ThisWorksDoNotMessUp() {
		super();
	}
	
	public Color getRandomColor() {
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		
		return new Color(r, g, b);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(getRandomColor());
		
		g.drawLine(10, 10, 200, 200);
	}

	public static void main(String[] arrrgs) {
		JFrame frame = new JFrame("g2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		
		ThisWorksDoNotMessUp panel = new ThisWorksDoNotMessUp();
		//panel.setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.DARK_GRAY);
		frame.setContentPane(panel);
		frame.setVisible(true);
	}

}



















