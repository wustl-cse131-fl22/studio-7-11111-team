package studio7;

public class Rectangle {
	private double length, width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	
	
	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getArea(){
		return length*width; 
	}
	
	
	public double getPerim(){
		return 2*length+2*width; 
	}
	
	public boolean isSqr(){
		return length == width; 
	}
}
