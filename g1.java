package Graphics;

import java.awt.Graphics;
import java.awt.*;

import javax.swing.JFrame;
import java.awt.Color;


public class g1 extends JFrame{
	
	public g1() {
		this.setTitle("g1");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setBackground(Color.DARK_GRAY);
		this.setLocationRelativeTo(null);
	}
	
	public Color getRandomColor() {
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		
		return new Color(r, g, b);
	}
	
	public void paint(Graphics g) {
		//super.paint(g);
		int w = getWidth();
		int h = getHeight();
		
		g.setColor(getRandomColor());
		
		g.drawLine(100, 100, 200, 200);
		
		loopColors(g, w/2, w, h/2, h);
		
	}
	
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
	

	public static void main(String[] args) {
		g1 frame = new g1();
		
		
		/*
		JFrame frame = new JFrame("g1");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setDefaultCloseOperation(christmasTreeLightUp.EXIT_ON_CLOSE);
		
		//JPanel panel = new JPanel();
		//panel.setBackground(Color.DARK_GRAY);
		//frame.add(panel);
		*/
		
		
	}

}










