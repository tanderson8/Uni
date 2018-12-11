public class FibonacciForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("0, 1");
			for(int fib0 = 0, fib1 = 0, fib2 = 1; fib2 < 1000;)
		{
			
			fib0 = fib1;
			fib1 = fib2;
			fib2 = fib1 + fib0;
		System.out.print(", " + fib2);
	}
	}
}
