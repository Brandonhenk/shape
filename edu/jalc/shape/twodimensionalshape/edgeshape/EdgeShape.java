package edu.jalc.shape.twodimensionalshape.edgeshape;

abstract public class EdgeShape extends Shape{
  private double width;
  private double height;

  public EdgeShape(double width, double height){
    this.setWidth(width);
    this.setHeight(height);
  }

  public double getWidth(){return this.width;}

  double setWidth(double width){
    this.width = width;
    return this.width;
  }

  public double getHeight(){return this.height;}

  double setHeight(double height){
    this.height = height;
    return this.height;
  }

  abstract public getPerimeter()
  abstract public getArea()

  public String toString(){
    return "height" + height + "width" + width;
  }
}
