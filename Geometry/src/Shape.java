
public abstract class Shape {
	private double x;
	private double y;
	protected String colour = "red";
	protected Boolean filled = true;
	Shape () {
		colour = "transparent";
		filled = false;
	}
		
	Shape(String colour,boolean filled){
		
			this.colour = colour;
			this.filled = filled;
		}
	
    
    
    public String getColour() 
    {
    	return colour;
    }
    public void setColour(String colour){
    	this.colour = colour;
    }
    public Boolean isFilled() {
    	return filled;
    }
    public void setFilled(Boolean filled) {
    	this.filled = filled;
    
    }
    public abstract double getArea();
    public abstract double getPerimer();
    public String toString() {
		return "Shape[colour = " + colour + ",filed = " + String.valueOf(filled) + "]";

    }
}

