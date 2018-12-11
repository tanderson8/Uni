
public class RecursionTeam {

	
	public static int RecursiveSummation(int n, int sum) {
	    if (n == 0) {
	        return sum;
	    }

	    sum += n;
	    return RecursiveSummation(n - 1, sum);
	}
	
	
	public static int IterativeSummation(int n2) {
		 int sum = 0;
        for (int i = 0; i <= n2; i++) {
              sum = sum + i;
        }
        return sum;

	}
	
	public static int Power(int x, int n) 
	{

		  if (n==0) { return 1; } // base

		  else // recursion

		  { 

		   x *= Power(x, n-1); 

		   return x; 

		  }
		 }
		 
	
	public static void main(String[] args) {
		
		System.out.println("Recursive Summation " + RecursiveSummation(5, 0));
		System.out.println("Iterative Summation " + IterativeSummation(5));
		System.out.println("Power " + Power(4,3));
	}
}
