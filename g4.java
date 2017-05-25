
/**
 * Write a description of class g4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class g4 extends JPanel
{
    
    public g4() {
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
        
        g.drawArc(0, h/2, 400, 300, 0, 180);
        
        drawArc(g, w, h/2);
        
        drawArc(g, w, h);
        
        g.setColor(getRandomColor());
        g.drawArc(0, 0, w, h, 0, 180);
        
        
        drawOvalArc(g, 20, 80);
        
        drawOvalArc2(g, 20, 80);
        
        drawOvalQuadratic(g, 20, 500);
        
        /*
        for(int x = 0; x < 400; x++) {
            for(int y = 0; y < 400; y++) {  
                g.setColor(getRandomColor());
                g.drawLine(0, 0, x, y);
            }
        }
        */

    }
    
    public void drawOvalArc(Graphics g, int x, int y) {
       for(int i = 0; i < 400; i++) {
           g.setColor(getRandomColor());
           g.fillOval(x, y+i, 5, 5);
       }
    }
    
    public void drawOvalArc2(Graphics g, int x, int y) {
        for(int i = 0; i < 400; i++) {
           g.setColor(getRandomColor());
           g.fillOval(x + (i/2), y+ (i/2), 5, 5);
       }
    }
    
    public void drawOvalQuadratic(Graphics g, int x, int y) {
        for(int i = 0; i < 50; i++) {
            g.setColor(getRandomColor());
            g.fillOval(x+ (i*i/5), y - (i*i/5), 5, 5);
        }
    }
    
    public void drawArc(Graphics g, int across, int down) {
       g.setColor(getRandomColor());
       g.drawArc(0, getWidth()-down, across, down, 0, 180);
       g.drawArc(0, 0+down, across, down, 0, 180);
    }

    public static void main(String[] arrrgs) {
        JFrame frame = new JFrame("g4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        
        g4 panel = new g4();
        //panel.setBackground(Color.DARK_GRAY);
        frame.setBackground(Color.DARK_GRAY);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
