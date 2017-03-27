package edu.jalc.shape.twodimensionalshape.edgeshape;

public class Rectangle extends EdgeShape{
  public Rectangle(double width, double height){
    super(width,height);
  }

  public final double getArea(){
    return this.getWidth() * this.getHeight();
  }
  public final double getPerimeter(){
    return 2 * this.getWidth() + 2 * this.getHeight();
  }
}
