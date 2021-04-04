
import java.awt.geom.*;
import java.awt.Color;

public class Circle extends MyShape {

    // Determine all fields that needed when drawing a circle.
    private Ellipse2D circle;
    private double x;
    private double y;
    private double r;
    private Color color;

    public Circle(double x, double y, double r, Color color) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.color = color;
        circle = new Ellipse2D.Double(x, y, r, r);
        
    }

    public Circle(double x, double y, Color color) {
        this(x, y, 40, color);
    }

    public Circle(double x, double y, double r) {
        this(x, y, r, Color.DARK_GRAY);
    }

    public Circle(double x, double y) {
        this(x, y, Color.DARK_GRAY);
    }

    // Creating APIS(method) that we can play with.
    // In this example we only create method that we are really need to draw a shape.
    public Ellipse2D getShape() {
        return circle;
    }

    public Color getColor() {
        return color;
    }
    public double getX(){return this.x;}
    public double getY(){return this.y;}
    public double getRadius(){return this.r;}
    
    @Override
    public MyShape resize(double size){
         MyShape resizeCircle = new Circle(getX()+(getRadius()*2),getY(),(getRadius()*(size/100)),getColor());
    return resizeCircle;}
    }
 

    

    // Other methods that user required.
    // . . .

