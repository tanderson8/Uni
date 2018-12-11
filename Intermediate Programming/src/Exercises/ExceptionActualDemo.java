import java.util.Scanner;
public class ExceptionActualDemo {

	public static void main(String[] args) {

		int num, deno;
		Scanner input = new Scanner(System.in);
		
		try
		{
			System.out.print("Please enter the numerator");
			num = input.nextInt();
			
			System.out.print("Please enter the denominator");
			deno = input.nextInt(); 
			
			System.out.println("The result is " + num/deno);
		}
		
		catch(Exception e)
		{
			//System.out.println("Error:Incorrect value");
			System.out.println(e.getMessage());
			
		}
		
		finally 
		{
			
			System.out.println(" ----- END OF PROGRAM ------");
			
		}
		
		
	}

}
