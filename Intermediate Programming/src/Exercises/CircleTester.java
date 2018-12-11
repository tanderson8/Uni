
/**
 * 
 * @adopted from the Liang's textbook
 * @ITEC 2150 - 01
 * @Decription: This program demonstrates how one Circle class can be evolved
 *
 */
public class CircleTester {
	
	public static void main(String [] args)
	{
		CircleV1 circle1  = new CircleV1();
		System.out.println("Area of the circle 1 with " + circle1.getRadius() + " is " + circle1.getArea());
		
		System.out.println(CircleV1.count);
		
		CircleV1 circle2 = new CircleV1(3.4);
		circle2.setRadius(5.5);
		System.out.println(circle2.getPerimeter());
		System.out.println(CircleV1.count);
		
	}

}

 class CircleV1{
	 
	private double radius  = 1.00; 
	 static int count = 0;//count means number of objects
	 CircleV1(){
		 count++;
	 } //no-arg constructor
	 
	 CircleV1(double newRadius)
	 {
		 this.radius = newRadius;
		 count++;
	 }
	 
	 double getArea() {
		return radius * radius * Math.PI; 
	 }
	 
	 double getPerimeter() {
		 return 2 * radius * Math.PI; 
	 }

	public double getRadius() {
		return radius;
	}

	  
	public void setRadius(double radius) {
		this.radius = radius;
	}
	 
	 
 }