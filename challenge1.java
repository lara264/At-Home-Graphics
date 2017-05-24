package Graphics;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class challenge1 extends JPanel{
	
	public challenge1() {
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
		
		//g.drawLine(10, 10, 200, 200);
		
		g.setColor(Color.RED);
		
		g.fillOval(100, 100, 5, 5);
		g.fillOval(400, 221, 5, 5);
		g.fillOval(500, 300, 5, 5);
		
		
		g.setColor(getRandomColor());
		g.fillOval(234, 541, 5, 5);
		
		challenge(g);

		
		/*
		for(int x = 0; x < 400; x++) {
			for(int y = 0; y < 400; y++) {
				g.setColor(getRandomColor());
				g.drawLine(0, 0, x, y);
			}
		}
		*/

	}
	
	public void challenge(Graphics g) {
		/*
		int a1x = 100;
		int a1y = 100;
		int a2x = 400;
		int a2y = 221;
		int a3x = 500;
		int a3y = 300;
		*/
		int a1x = 0;
		int a1y = getHeight();
		int a2x = getWidth()/2;
		int a2y = 0;
		int a3x = getWidth();
		int a3y = getHeight();
		
		int new4x = 234;
		int new4y = 541;
		
		for(int i = 0; i < 5000; i++) {
			int middleX = 0;
			int middleY = 0;
			int random = (int)(Math.random()*3)+1;
			g.setColor(getRandomColor());
			if(random == 1) {
				middleX = (new4x + a1x)/2;
				middleY = (new4y + a1y)/2;
				g.fillOval(middleX, middleY, 5, 5);
				new4x = middleX;
				new4y = middleY;
			}
			else if(random == 2) {
				middleX = (new4x + a2x)/2;
				middleY = (new4y + a2y)/2;
				g.fillOval(middleX, middleY, 5, 5);
				new4x = middleX;
				new4y = middleY;
			}
			else if(random == 3) {
				middleX = (new4x + a3x)/2;
				middleY = (new4y + a3y)/2;
				g.fillOval(middleX, middleY, 5, 5);
				new4x = middleX;
				new4y = middleY;
			}
		}
	}


	public static void main(String[] arrrgs) {
		JFrame frame = new JFrame("challenge1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		
		challenge1 panel = new challenge1();
		//panel.setBackground(Color.DARK_GRAY);
		frame.setBackground(Color.DARK_GRAY);
		frame.setContentPane(panel);
		frame.setVisible(true);
	}

}
