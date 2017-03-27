package edu.jalc.shape.twodimensionalshape.ellipseshape;

abstract public class EllipseShape{
  private double minorAxis;
  private double majorAxis;

  public EllipseShape(double minorAxis, double majorAxis){
    this.setMinorAxis(minorAxis);
    this.setMajorAxis(majorAxis);
  }
  public final getMinorAxis(){ return this.minorAxis;}

  final double setMinorAxis(double minorAxis){
    this.minorAxis = minorAxis;
    return this.minorAxis;
  }

  public final getMajorAxis(){return this.majorAxis;}

  final double setMajorAxis(double majorAxis){
    this.majorAxis = majorAxis;
    return this.majorAxis;
  }

  abstract public getCircumference()
  public final double getArea(){
    return this.getMinorAxis() * this.getMajorAxis() * Math.PI;
  }

  public String toString(){
    return "minorAxis: " + minorAxis + "majorAxis: " + majorAxis + "Area: " + this.getArea();
  }
}
