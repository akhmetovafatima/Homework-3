
public class Rectangle extends Shape{
  protected double length;
  protected double width;
  Rectangle () {
	  length = 1.0;
	  width = 1.0;
  }
  Rectangle(double width,double length){
	  this.width = width;
	  this.length = length;
  }
  Rectangle(double width,double length,String colour,boolean filled){
	  super(colour,filled);
	  this.length = length;
	  this.width = width;
  }
  public double getArea() {
	  return length*width;
  }
  public double getPerimer() {
	  return 2*(length + width);
  }
  public double getWidth() {
	  return width;
  }
  public void setWidth(double width) {
	  this.width = width;
  }
  public double getLength() {
	  return length;
  }
  public void setLength(double length) {
	  this.length = length;
  }
  public String toString() {
		return "Rectangle[Shape[colour = " + colour + ",filed = " + String.valueOf(filled) + "],width =" + String.valueOf(width)+",length = "+ String.valueOf(length) + "]";
	
  }
  
}
