
// Observer class

import java.awt.geom.*;
import java.awt.Color;

public abstract class MyShape {

    public abstract RectangularShape getShape();

    public abstract Color getColor(); 

    public abstract MyShape resize(double size);
}