package edu.jalc.shape;

import edu.jalc.shape.twodimensionalshape.edgeshape.Square;
import edu.jalc.shape.twodimensionalshape.edgeshape.Rectangle;
import edu.jalc.shape.twodimensionalshape.edgeshape.RightTriangle;
import edu.jalc.shape.twodimensionalshape.ellipseshape.Ellipse;
import edu.jalc.shape.twodimensionalshape.ellipseshape.Circle;
import edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;
import java.util.ArrayList;

public class Driver{
  public static void main(String[] args){
    ArrayList<TwoDimensionalShape> shapes = new ArrayList();
    shapes.add(new Square(2));
    shapes.add(new Circle(2.1));
    shapes.add(new Ellipse(2.1, 4.5));
    shapes.add(new Rectangle(2.0,2.0));
    shapes.add(new RightTriangle(2.0, 4.0));

    ArrayList<String> names = new ArrayList();
    names.add("Square");
    names.add("Circle");
    names.add("Ellipse");
    names.add("Rectangle");
    names.add("Right Triangle");

    for(int i = 0; i < shapes.size();i++){
      for(int e = 0; e < shapes.size(); e++){
        System.out.println(names.get(i) + " equals " + names.get(e) + "? " + shapes.get(i).equals(shapes.get(e)));
      }
    }
  }
}
