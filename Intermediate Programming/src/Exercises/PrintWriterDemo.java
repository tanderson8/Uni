import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException   {

		File file = new File("C://Users/Baron/Uni/Uni/Spring 2018/Intermediate Programming/Programs/Quiz.txt");
		if(file.exists())
		{
			System.out.println(("File exists"));
			System.exit(1);
		}

		PrintWriter write = new PrintWriter(file);
		
		write.print("John Jacob");
		write.print("80");
		write.print("Jay Snyder");
		write.print("90");
		
		write.close(); 
	}
}
