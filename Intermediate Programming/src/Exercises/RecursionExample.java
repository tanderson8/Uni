
public class RecursionExample {

	/** calculates n factorial

	*/

	public static int factorial(int n) { 
		System.out.println("n is " + n); 
		if (n == 0) {
			return 1;
		}
		
		else if (n < 0){ 
			throw new IllegalArgumentException ("n must be non-negative");
		}
		
		else {

	System.out.println("need factorial of " + (n-1));

	int answer = factorial(n-1); System.out.println("factorial of " +(n-1)

	+ " is " + answer);

	return answer * n;

	}

	}
public static void countdown(int n) { 
	if (n >= 1) {

	System.out.println(n); countdown(n-1);

	}
	
	if (n >= -1) {

		System.out.println(n); countdown(n+1);

		}
}

	public static void countup(int n) { 
		if (n >= 1) {

		System.out.println(n); countup(n+1);

		}
		
		if (n >= -1) {

			System.out.println(n); countup(n-1);

			}
	}

public static void main(String[] args) { 
	//countdown(10);
	countup(1);
	//System.out.println(factorial(-3));

	}

}
