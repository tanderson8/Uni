import java.util.Date;

public class DateTester {

	public static void main(String[] args) {

		Date date1 = new Date(1000);
		System.out.println(date1.toString());

		long time = 100000;
		
		for (int i = 0; i < 8; i++) {
			
			date1.setTime(time);
			System.out.println(date1.toString());
			time *= 10;
		}
	}

}
