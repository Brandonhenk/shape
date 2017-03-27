package edu.jalc.shape.twodimensionalshape.ellipseshape;
import edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;

public final class Circle extends Ellipse{
  private double radius;
  public Circle(double radius){
    super(radius,radius);
    this.radius = radius;
  }
  public double getCircumference(){
    return (this.getMinorAxis() + this.getMajorAxis()) * Math.PI;
  }
  public final String toString(){
		return "radius: " + this.getMajorAxis() + "   area: " + this.getArea();
	}
}
