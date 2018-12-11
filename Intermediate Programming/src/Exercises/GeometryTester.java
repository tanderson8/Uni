import java.util.Date;
import java.util.Scanner;

public class GeometryTester {

	public static void main(String[] args) {
		
    Scanner input = new Scanner(System.in);

    System.out.println("Enter three sides of the GeoTriangle");
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();

    System.out.println("Enter the color of the GeoTriangle");
    String color = input.next();

    System.out.println(" Is the GeoTriangle filled? Reply with 'True' or 'False' ");

    String filled = input.next(); 




    GeoTriangle geoTriangle = new GeoTriangle(side1, side2, side3);
    geoTriangle.setFilled(isFilled());
    geoTriangle.setColor(getColor());

 
    System.out.println("The GeoTriangle Sides are \n side 1: " 
            + geoTriangle.getSide1() + "\n Side 2: " + geoTriangle.getSide2() 
            + "\n Side 3: " + geoTriangle.getSide3());

    System.out.println("The GeoTriangle's Area is " + geoTriangle.getArea());
    System.out.println("The GeoTriangle's Perimeter is " + geoTriangle.getPerimeter());
    System.out.println("The GeoTriangle's Color is " + geoTriangle.getColor());
    System.out.println("Is the GeoTriangle filled? " + geoTriangle.isFilled());
		}
	

}
