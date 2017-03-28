package edu.jalc.shape.twodimensionalshape.ellipseshape;
import edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;

abstract public class EllipseShape extends TwoDimensionalShape{
  private double minorAxis;
  private double majorAxis;

  public EllipseShape(double minorAxis, double majorAxis){
    this.setMinorAxis(minorAxis);
    this.setMajorAxis(majorAxis);
  }
  public final double getMinorAxis(){ return minorAxis;}

  final double setMinorAxis(double minorAxis){
    this.minorAxis = minorAxis;
    return this.minorAxis;
  }

  public final double getMajorAxis(){return majorAxis;}

  final double setMajorAxis(double majorAxis){
    this.majorAxis = majorAxis;
    return this.majorAxis;
  }

  abstract public double getCircumference();
  public final double getArea(){
    return this.getMinorAxis() * this.getMajorAxis() * Math.PI;
  }

  public String toString(){
    return "minorAxis: " + minorAxis + "majorAxis: " + majorAxis + "Area: " + this.getArea();
  }
}
