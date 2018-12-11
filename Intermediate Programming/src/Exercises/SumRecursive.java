
public class SumRecursive {

	public static void main(String[] args) {
		System.out.println(sum(5));
		

	}
	
	public static int sum(int n) {
		if(n <= 0) {
			System.out.println("return 0: " + 0);
			return 0;
		}
		
		else {
			int total = n + sum(n-1);
			System.out.println("Returning " + total);
			return total;
		}
	}

}
