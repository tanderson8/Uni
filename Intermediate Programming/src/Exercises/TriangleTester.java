
public class TriangleTester {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle(6, 10);
		System.out.printf("Area of the triangle 1 with a  base of " + triangle1.getBase() + " and a height of " + triangle1.getHeight() + " is %4.2f", triangle1.getArea());
	
		System.out.println();
		
		Triangle triangle2 = new Triangle(7.5, 30.5);
		System.out.printf("Area of the triangle 2 with a  base of " + triangle2.getBase() + " and a height of " + triangle2.getHeight() + " is %4.2f", triangle2.getArea());
	}

}
