import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemoAnother {

	public static void main(String[] args) {

		int index = 0;
		Scanner input = new Scanner(System.in);
		int[] list = {10,11,12,13,14,15};
		System.out.print("Please enter the index of the list:");
		
		try
		{
			index = input.nextInt(); 
			System.out.printf("list[%d] = %d%n", index, list[index]);
		}
		
		catch(ArrayIndexOutOfBoundsException ex)
		{
			
			System.out.println("Error: Index is invalid.");
			System.out.println(ex.toString());
			System.out.println(ex.getStackTrace());
		}
		
		catch(InputMismatchException ex)
		{
			System.out.println("Error: Your did not enter an integer.");
			ex.printStackTrace(); 
			System.out.println(ex.getStackTrace());
			System.out.println(ex.getMessage());
		}
		
		catch(Exception e)
		{
			System.out.printf(e.getMessage());
			
		}
		
		

	}

}
