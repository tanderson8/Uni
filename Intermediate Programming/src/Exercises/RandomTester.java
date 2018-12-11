import java.util.Random;
public class RandomTester {

	public static void main(String[] args) {

		Random r1 = new Random(1000);

		for(int i = 0; i < 50; i++) {
			System.out.print(r1.nextInt(100) + " ");
		}
	}

}
