package edu.jalc.shape.twodimensionalshape.edgeshape;
public final class RightTriangle extends Triangle{
  public RightTriangle(double base, double height){
    super(base,height);
  }
  public final double getPerimeter(){
    double height = this.getHeight();
		double width = this.getWidth();
		double hypotenuse = Math.sqrt(height * height + width * width);
		return height + width + hypotenuse;
  }
}
