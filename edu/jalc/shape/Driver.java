package edu.jalc.shape;

import edu.jalc.shape.twodimensionalshape.edgeshape.Square;
import edu.jalc.shape.twodimensionalshape.edgeshape.Rectangle;
import edu.jalc.shape.twodimensionalshape.edgeshape.RightTriangle;
import edu.jalc.shape.twodimensionalshape.ellipseshape.Ellipse;
import edu.jalc.shape.twodimensionalshape.ellipseshape.Cirlce;

public class Driver{
  public static void main(String[] args){
    ArrayList<TwoDimensionalShape> shapes = new ArrayList<>();
    shapes.add(new Square(2,2));
    shapes.add(new Circle(2.1,2.1));
    shapes.add(new Ellipse(2.1, 4.5));
    shapes.add(new Rectangle(2.0,3.0));
    shapes.add(new RightTriangle(2.0, 5.0));
    //System.out.println("Square equals circle? " + square.equals(circle));
  	//System.out.println("Square equals right triangle? " + square.equals(rightTriangle));
  }
}
