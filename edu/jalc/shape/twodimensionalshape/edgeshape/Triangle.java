package edu.jalc.shape.twodimensionalshape.edgeshape;
abstract public class Triangle  extends EdgeShape{

  public Triangle(double base, double height){
    super(base,height);
  }

  public final double getArea(){
    return this.getWidth() * this.getHeight()* .5;
  }
}
