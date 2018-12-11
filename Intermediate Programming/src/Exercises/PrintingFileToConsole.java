import java.io.*;
import java.util.Scanner;

public class PrintingFileToConsole {

	public static void main(String[] args) throws FileNotFoundException  {
		
		long start =  System.currentTimeMillis();
		File file = new File("C://Users/Baron/Uni/Uni/Spring 2018/Intermediate Programming/Programs/HarryPotterPart.txt");
		Scanner read = new Scanner(file);
		print(read);
		long end = System.currentTimeMillis();
		System.out.println("Elapsed Time: " + (end - start));
		
		

	}

	public static void print(Scanner input) {
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
	}
	public static void printRecursive(Scanner input) {
		//base case
		if(!input.hasNextLine()) {
			return;
		}
		String line = input.nextLine();
		printRecursive(input); //print the rest
		System.out.println(line);
	}
	}
