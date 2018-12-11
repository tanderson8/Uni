
public class LeapYearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("isLeapYear(1970): " + isLeapYear(1970));
			System.out.println("isLeapYear(1996): " + isLeapYear(1996));
			System.out.println("isLeapYear(2000): " + isLeapYear(2000));
			System.out.println("isLeapYear(1600): " + isLeapYear(1600));
			System.out.println("isLeapYear(1776): " + isLeapYear(1776));
			System.out.println("isLeapYear(1700): " + isLeapYear(1700));
	}
	
	static boolean isLeapYear(int n)
	{
		
	return (n % 4 == 0 && n % 100 != 0 || n % 400 == 0);
		
	
		
	}
}
