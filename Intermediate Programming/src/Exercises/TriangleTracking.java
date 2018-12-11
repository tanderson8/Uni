
public class TriangleTracking {
	public static void main(String [] args) {
		
		long start =  System.currentTimeMillis();
		System.out.println(triangleRecursive(6));
		System.out.println(triangleWhile(10));
		long end = System.currentTimeMillis();
		System.out.println("Elapsed Time: " + (end - start));
		}
		
	
	public static int triangleRecursive(int n )
		{
			
		if(n == 1) {
			System.out.println("Returning 1");
			return 1;
		}
		
		else {
			int temp = n + triangleRecursive(n-1);
			System.out.println("Returning " + temp);
			return temp;
		}	
		}
		
	public  static int  triangleWhile(int n) {
		int total = 0;
		int i = 1;
		while(i <= n) {
		
			total++;
			i++;
		
		}
		return total;
	}	
}
