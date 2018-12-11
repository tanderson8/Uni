import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessing {
	

	final static String filename = "integers"
			+ ".txt";

	   public static void main(String[] args) {

	      Scanner scan = null;
	      File f = new File(filename);
	      try {
	         scan = new Scanner(f);
	      } catch (FileNotFoundException e) {
	         System.out.println("File not found.");
	         System.exit(0);
	      }

	      int total = 0;
	      boolean foundInts = false; //flag to see if there are any integers

	      while (scan.hasNextLine()) { //Note change
	         String currentLine = scan.nextLine();
	         //split into words
	         String words[] = currentLine.split(" ");

	         //For each word in the line
	         for(String str : words) {
	            try {
	               int num = Integer.parseInt(str);
	               total += num;
	               foundInts = true;
	               System.out.println(num);
	            }catch(NumberFormatException nfe) { }; //word is not an integer, do nothing
	         }
	      } //end while 

	   }
}
