import java.util.Scanner;
public class ExceptionThrow {

	public static void main(String[] args) {

		int index = 0;
		Scanner input = new Scanner(System.in);
		int[] list = {10,11,20,50,60,70};
		
		System.out.print("Please enter the index number.");
		
		try
		{
			index = input.nextInt(); 
			if(index == 0)
				throw new ArrayIndexOutOfBoundsException();
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: Invalid input. DO not enter 0 for the index.");
		}
		finally
		{
			System.out.println(" ---- END OF THE PROGRAM ---");
		}
		

	}

}
