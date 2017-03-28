package edu.jalc.shape.twodimensionalshape.ellipseshape;
import edu.jalc.shape.twodimensionalshape.TwoDimensionalShape;

public class Ellipse extends EllipseShape{
  public Ellipse(double minorAxis, double majorAxis){
    super(minorAxis, majorAxis);
  }
  public double getCircumference(){
    double minorAxis = this.getMinorAxis();
    double majorAxis = this.getMajorAxis();
    return 2 * Math.PI * Math.sqrt((minorAxis * minorAxis + majorAxis * majorAxis)/ 2);
  }
}
