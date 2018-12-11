/**
 * 
 * source: Schaum's Outlines Programming with Java by John Hubbard
 * This program illustrates the conversion between a variable of short type, 
 * and instance of the short class, and an instance of the String class
 *
 */
public class TestShort {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		short m = 22;
		System.out.println("short m = " + m);
		
		//convert short to Short
		Short x = new Short(m);
		
		System.out.println("Short x = " + x);
		
		String s = x.toString();  // convert Short to String
		System.out.println("String s = " + s);
		
		m = Short.parseShort(s);  //converts String to short
		System.out.println("short m  = " + m);

		s = Short.toString(m); //convert Short to String
		System.out.println("String s = " + s);
		
		x = Short.decode(s); //converts String to Short
		System.out.println("Short x = " + x);
		
		m = x.shortValue(); //converts Short to short
		System.out.println("short m = " + m);
		
		System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
		System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
		


	}

}
