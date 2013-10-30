package geometric.util;


public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	

	public double getPerimieter() {
		// TODO Auto-generated method stub
		return (2*Math.PI*this.radius);
	}

	
	public double getArea() {
		// TODO Auto-generated method stub
		return (Math.PI*Math.pow(this.radius, 2));
	}
	
	public String toString() {
		return "Radius of the circle is : " + this.radius;
	}
}
