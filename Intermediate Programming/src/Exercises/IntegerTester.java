
public class IntegerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger integer1 = new MyInteger(78);
		MyInteger integer2 = new MyInteger(65);
		MyInteger integer3 = new MyInteger(78);
		
		
		System.out.println("Is the number " + integer1.getValue() + " an even number? " + integer1.isEven());
		System.out.println("Is the number " + integer1.getValue() + " an odd number? " + integer1.isOdd());
		System.out.println("Is the number " + integer1.getValue() + " a prime number? " + integer1.isPrime());
		
		System.out.println();
				
		System.out.println("Is the number " + integer2.getValue() + " an even number? " + integer2.isEven());
		System.out.println("Is the number " + integer2.getValue() + " an odd number? " + integer2.isOdd());
		System.out.println("Is the number " + integer2.getValue() + " a prime number? " + integer2.isPrime());
		
		System.out.println();
		
		System.out.println("Is " + integer1.getValue() + " equal to " + integer2.getValue() + "? " + integer1.equals(integer2));
		System.out.println("Is " + integer1.getValue() + " equal to " + integer3.getValue() + "? " + integer1.equals(integer3));
		
		System.out.println();
		
		System.out.println(MyInteger.parseInt(new char[] {'6', '3', '6'}));
        System.out.println(MyInteger.parseInt("22"));
	}
	}


