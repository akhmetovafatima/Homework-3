
public  class Circle  extends Shape{
	private double radius = 1.0; 
    Circle(){
    	
    }
	Circle (double radius){
		this.radius = radius;
	}
    Circle(double radius, String colour, boolean filled ){
    	super(colour, filled);
    	this.radius = radius;
    }


	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getPerimer() {
		return Math.PI*2*radius;
	}
	

	public double getRadius(double radius) {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
		
	

