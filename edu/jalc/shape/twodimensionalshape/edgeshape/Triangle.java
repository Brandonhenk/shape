package edu.jalc.shape.twodimensionalshape.edgeshape;
abstract public class Triangle  extends EdgeShape{
  
  public Triangle(double width, double height){
    super(width,height);
  }

  public final double getArea(){
    return 1/2 * this.getWidth() * this.getHeight();
  }
}
