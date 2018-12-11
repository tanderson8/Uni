
public class TriangleNumberWhile {

	public static void main(String[] args) {
		System.out.println(triangle(5));

	}

	public static int triangle(int n) {
		int total = 0;
		int i = 1;
		while(i <= n) {
			total++;
			i++;
		
		}
		return total;
	}
}
