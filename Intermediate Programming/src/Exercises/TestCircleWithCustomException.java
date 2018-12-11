/*
 * The program is trying to test out the radius of three circles, if the 
 * program is not able to find the radius, the catch is there to display 
 * that there is a problem and where the problem lies 
 */

public class TestCircleWithCustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			new CircleWithCustomException(10);
			new CircleWithCustomException(-20);
			new CircleWithCustomException(0);
		}
		
		catch(InvalidRadiusException ex) {
			System.out.println(ex);
		}
		
		System.out.println("Number of objects created: " + CircleWithCustomException.getNumberOfObjects());
	}

}
