import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args)  throws FileNotFoundException   {

		File file = new File("C://Users/Baron/Uni/Uni/Spring 2018/Intermediate Programming/Programs/Hamlet.txt");
		
		Scanner read = new Scanner(file);
		
		int count = 0;
		while (read.hasNext()) {
			
			String word  = read.next();
			count++;
		}

		System.out.println("Total words is: " + count);
		read.close();
	}

}
