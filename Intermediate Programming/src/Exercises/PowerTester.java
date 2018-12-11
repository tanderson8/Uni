import java.util.*;
import java.util.concurrent.TimeUnit;


public class PowerTester {

	public static void main(String[] args) {
		
		long start =  System.nanoTime();
		System.out.print(power(3,10));
		System.out.print(powerInefficient(3,50));
		System.out.print(powerEfficient(3,50));
		long end = System.nanoTime();
		System.out.println("Elapsed Time: " + (end - start));
		
	}


	public static int power(long base, long exponent) {
		if(exponent < 0) throw new IllegalArgumentException("exponent cannot be negative");
		if(exponent == 0) {
			return 1;
		}
		return 0;
	}
	
	
	
public static long powerInefficient(int x, int n) {
	if(n == 0) 
		return 1;
	if(n %2 == 0) {
		return powerInefficient(x, n/2) * powerInefficient(x, n/2);
	}
	else
		return x * powerInefficient(x, n/2) * powerInefficient(x, n/2);
}

public static long powerEfficient(int x, int n) {
	
	if(n == 0) 
		return 1;
	long temp = powerEfficient(x, n/2);
	
	if(n % 2  == 0) {

		return temp * temp;
	}
	else return x * temp * temp;

}
}