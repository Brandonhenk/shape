package edu.jalc.shape.twodimensionalshape.edgeshape;

abstract public class EdgeShape{
  private double width;
  private double hight;

  public EdgeShape(double width, double hight){
    this.setWidth();
    this.setHight();
  }

  public double getWidth(){return this.width;}

  double setWidth(double width){
    this.width = width;
    return this.width;
  }

  public double getHight(){return this.hight;}

  double setHight(double hight){
    this.hight = hight;
    return this.hight;
  }

  abstract public getPerimeter()
  abstract public getArea()

  public String toString(){
    return "Adding Hight and Width";
  }
}
