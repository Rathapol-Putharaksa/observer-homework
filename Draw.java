/**
 *
 * @author 
 * 1. 6110613228 นายรัฐพล พุทธรักษา
 * 2. 6110613129 นายปุณณธัช บุณยรัตนสุนทร
 * 3. 6110613087 นายวรรษกร วัฒนเมธาวี
**/

import java.awt.Color;
import javax.swing.JPanel;


import java.util.ArrayList;
import java.util.List;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Draw extends JPanel {

    public void paint(Graphics g) {

        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;

        // We have Circle and Rectangle class which handle all the works that need to be done.
        // When user need to create circle or rectangle they just have to create reference variable to the classes.
        MyShape circle = new Circle(100, 100, 70);
        MyShape circle2 = new Circle(300, 300, 100,Color.BLUE);
        MyShape rectangle = new Rectangle(600, 600, 80, 100, Color.PINK);
        Observer l = new Observer();
        l.addShape(circle);
        l.addShape(rectangle);
        l.addShape(circle2);
        l.resizeAll(50);
        
        
        // We can use reference variable to get color of that shape.
        // Set and fill circle.
        List<MyShape> x = l.getList();
        for (MyShape i : x){
        
        g2.setPaint(i.getColor());
        g2.fill(i.getShape());
            System.out.println(i.getShape());
        }
        
       
        // Set and fill circle1.
        

    }

    public static void main(String[] args) {

        // Calling Draw
        Draw s = new Draw();

        // Create canvas.
        JFrame f = new JFrame();

        // Add what we want to Draw.
        f.add(s);
        f.setVisible(true);
        f.setSize(4000, 4000);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
