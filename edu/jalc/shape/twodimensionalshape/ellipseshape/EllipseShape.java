package edu.jalc.shape.ellipseshape;

abstract public class EllipseShape{
  private double minorAxis;
  private double majorAxis;

  public EllipseShape(double minorAxis, double majorAxis){
    this.setMinorAxis(minorAxis);
    this.setMajorAxis(majorAxis);
  }
  public getMinorAxis(){ return this.minorAxis;}

  double setMinorAxis(double minorAxis){
    this.minorAxis = minorAxis;
    return this.minorAxis;
  }

  public getMajorAxis(){return this.majorAxis;}

  double setMajorAxis(double majorAxis){
    this.majorAxis = majorAxis;
    return this.majorAxis;
  }

  abstract public getCircumference()
  abstract public getArea()
}
