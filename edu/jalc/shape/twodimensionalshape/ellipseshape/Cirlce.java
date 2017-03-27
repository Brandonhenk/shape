package edu.jalc.shape.twodimensionalshape.ellipseshape;

public final class Circle extends Ellipse{

  public Circle(double radius){
    super(radius, radius);
  }
  public double getCircumference(){
    return (this.getMinorAxis() + this.getMajorAxis()) * Math.PI;
  }
  public final String toString(){
		return "radius: " + super.getMajorAxis() + "   area: " + this.getArea();
	}
}
