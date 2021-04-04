/**
 *
 * @author 
 * 1. 6110613228 นายรัฐพล พุทธรักษา
 * 2. 6110613129 นายปุณณธัช บุณยรัตนสุนทร
 * 3. 6110613087 นายวรรษกร วัฒนเมธาวี
**/

import java.awt.geom.*;
import java.awt.Color;

public class Rectangle extends MyShape {
    
    // Determine all fields that needed when drawing a rectangle.
    private Rectangle2D rectangle;
    private double x;
    private double y;
    private double width;
    private double height;
    private Color color;
    
    // Constructure
    public Rectangle(double x, double y, double width, double height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        rectangle = new Rectangle2D.Double(x, y, width, height);
    }

    public Rectangle(double x, double y, double width, double height) {
        this(x, y, width, height, Color.LIGHT_GRAY);
    }

    public Rectangle(double x, double y, double width) {
        this(x, y, width, width, Color.LIGHT_GRAY);
    }

    public Rectangle(double x, double y, Color color) {
        this(x, y, 80, 80, color);
    }

    public Rectangle(double x, double y) {
        this(x, y, 80, 80, Color.LIGHT_GRAY);
    }

    // Creating APIS(method) that we can play with.
    // In this example we only create method that we are really need to draw a shape.
    public Rectangle2D getShape() {
        return rectangle;
    }

    public Color getColor() {
        return color;
    }
    public double getX(){return this.x;}
    public double getY(){return this.y;}
    public double getWidth(){return this.width;}
    public double getHeight(){return this.height;}

    @Override
    public MyShape resize(double size){
   MyShape resizeRec = new Rectangle(getX()+100,getY(),getWidth()*(size/100),getHeight()*(size/100),getColor());
    return resizeRec;}

    // Other methods that user required.
    // . . .

}
