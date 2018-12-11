
public class extends GeometricCircle {

	private double radius;
	
	public GeometricCircle() {
		
	}
	
	public GeometricCircle(double radius) {
		this.radius = radius;
	}
	
	public GeometricCircle(double radius, String color, boolean filled) {
		
		this.radius = radius;
		setColor(color);
		setFilled(filled);
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	 public double getArea() {
		 
		 return radius * radius * Math.PI;
	 }
	 
	 public double getPerimeter() {
		 return 2 * radius * radius;
	 }
	 
	 public void printCircle() {
		 System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	 }
}

