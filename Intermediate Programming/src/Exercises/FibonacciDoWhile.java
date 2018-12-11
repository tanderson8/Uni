
public class FibonacciDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fib1 = 1;
		int fib0 = 0;
		int n = 0;
		System.out.print("0 1 ");
		do {
			int fib2 = fib1 + fib0;
			fib0 = fib1;
			fib1 = fib2;
			System.out.print(" " + fib2+" ");
			n++;
		}while(n<1000);//n is number of terms
	}

}
