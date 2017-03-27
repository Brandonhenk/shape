package edu.jalc.shape.twodimensionalshape;

abstract public class TwoDimensionalShape{
  abstract public double getArea()

  public final boolean equals(TwoDimensionalShape other){
    return this.getArea() == other.getArea();
  }

}
