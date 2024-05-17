import javax.swing.JFrame;
import java.util.Random;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JFrame;

public class App extends JFrame implements MouseMotionListener {

    Container contendedor;
    int x,y;
    int random_1, random_2, random_3;
    Random random;
    public App() {

        contendedor = getContentPane();

        addMouseMotionListener(this);

        random = new Random();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);

    }

    public void paint(Graphics g){
        g.setColor(new Color(random_1,random_2,random_3));
        g.fillRect(x, y, 5, 5);
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        random_1 = random.nextInt(255);
        random_2 = random.nextInt(255);
        random_3 = random.nextInt(255);
        
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
