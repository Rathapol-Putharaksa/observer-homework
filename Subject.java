
import java.util.ArrayList;
import java.util.List;
public class Subject {
    
private List<MyShape> Shape = new ArrayList<MyShape>();
 
  
  public void addShape(MyShape i){
    Shape.add(i);    
  }
  public List getList(){return this.Shape;}
  public void resizeAll(double size){
      int s = Shape.size();
     for (int i = 0;i<s;i++) {
         Shape.add(Shape.get(i).resize(size));
       
     }
  }  
}
