package edu.jalc.shape.twodimensionalshape.edgeshape;
import edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;

abstract public class EdgeShape extends TwoDimensionalShape{
  private double width;
  private double height;

  public EdgeShape(double width, double height){
    this.setWidth(width);
    this.setHeight(height);
  }

  public final double getWidth(){return this.width;}

  double setWidth(double width){
    this.width = width;
    return this.width;
  }

  public final double getHeight(){return this.height;}

  double setHeight(double height){
    this.height = height;
    return this.height;
  }

  abstract public double getPerimeter();
  abstract public double getArea();

  public String toString(){
    return "height" + height + "width" + width;
  }
}
