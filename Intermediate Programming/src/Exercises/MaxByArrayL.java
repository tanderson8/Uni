import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxByArrayL {

	public static void main(String [] args)
	{
	ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
System.out.print("Enter integers and if you want to ends of the input, enter 0 at the end.");

		//(4) Write a do-while loop to add the values to yourList. 
		
int number; 
do {
	number = input.nextInt();
	if(number !=0)
		list.add(number);
}while(number != 0);

System.out.print("The maximum number is " +max(list));

	}
	




	public static Integer max(ArrayList<Integer> list)
	{
		//(1) Write a statement to make this method returns null if the list is null 
		//or the list size is 0. 
		
		if (list.isEmpty() || list == null){

			return null;
		
		}
		
		else {
			
			
		return max(list);	
	}
	}





		//(2) Declare the max variable and initialize with the first value of the list. 

private static Integer findMaxNumber (List<Integer> numberList) {
	Integer max = Integer.MAX_VALUE;
	for(Integer number : numberList) {
		if(number > max) {
			max = number;
		}
	}
	return max;
}
			
		
//(3) Remember the length of the ArrayList is .size() 
		//    By using the for loop, determine the max value
		//    then return the max. 	
		
	}

