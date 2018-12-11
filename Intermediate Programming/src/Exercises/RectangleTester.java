
public class RectangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(4, 40);
		Rectangle rectangle3 = new Rectangle(3.5, 35.9);
		
		System.out.println(rectangle2.getPerimeter());
	}
	
}
	class Rectangle{

		double width = 1.0;
		double height = 1.0;
		
		Rectangle(){};
		
		Rectangle(double newWidth, double newHeight){
			this.width = newWidth;
			this.height = newHeight;
		}
		
		double getArea() {
			return width * height;
		}
		
		double getPerimeter() {
			return 2 * (width + height);
		}
}
