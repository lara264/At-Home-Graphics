
/**
 * Write a description of class fractal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class fractal extends JPanel{
    
    public fractal() {
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
        
        g.setColor(Color.RED);
        
        
        g.setColor(getRandomColor());
        g.fillOval(234, 541, 5, 5);
        
        challenge(g);

    }
    
    public void challenge(Graphics g) {
        int a1x = 0;
        int a1y = 0;
        int a2x = getWidth()/2;
        int a2y = 0;
        int a3x = getWidth();
        int a3y = getHeight();
        int a4x = getWidth()/2;
        int a4y = getHeight();
        
        int new4x = 234;
        int new4y = 541;
        
        for(int i = 0; i < 5000; i++) {
            int middleX = 0;
            int middleY = 0;
            int random = (int)(Math.random()*4)+1;
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
            else if(random == 4) {
                middleX = (new4x + a4x)/2;
				middleY = (new4y + a4y)/2;
				g.fillOval(middleX, middleY, 5, 5);
				new4x = middleX;
				new4y = middleY;
            }
        }
    }


    public static void main(String[] arrrgs) {
        JFrame frame = new JFrame("fractal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        
        fractal panel = new fractal();
        //panel.setBackground(Color.DARK_GRAY);
        frame.setBackground(Color.DARK_GRAY);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

}
