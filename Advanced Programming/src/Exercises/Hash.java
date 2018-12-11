import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Hash {

	public static void main(String[] args) throws Exception{
		File file = new File("C:/Users/Baron/Uni/Uni/Fall 2018/Advanced Programming/Programs/Exercises/states.txt");
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			String [] words = line.split(",");
		}
		HashMap<String,String> ssn = new HashMap<String,String>();
		ssn.put("111-11-1111", "Superman");
		ssn.put("222-22-2222", "Batman");

		System.out.println(ssn.size());
		System.out.println(ssn.get(222-22-2222));


	}

}
