
/**
 *
 * @author 
 * 1. 6110613228 นายรัฐพล พุทธรักษา
 * 2. 6110613129 นายปุณณธัช บุณยรัตนสุนทร
 * 3. 6110613087 นายวรรษกร วัฒนเมธาวี
**/

import java.awt.geom.*;
import java.awt.Color;

public abstract class MyShape {

    public abstract RectangularShape getShape();

    public abstract Color getColor(); 

    public abstract MyShape resize(double size);
}