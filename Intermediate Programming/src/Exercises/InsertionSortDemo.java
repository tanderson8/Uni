import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class InsertionSortDemo {

	public static void main(String[] args) {
		
		 Random generator = new  Random();

	      int[] list = new int[10]; // create array

	      for (int i = 0; i < list.length; i++) // populate array
	         list[i] = 10 + generator.nextInt(100);

	      System.out.printf("Unsorted array:%n%s%n%n", 
	         Arrays.toString(list)); // display array
	      insertionSort(list); // sort array

	      System.out.printf("Sorted array:%n%s%n%n", 
	         Arrays.toString(list)); // display array
	}
	
	public static void insertionSort(int[] list)
	{
		//loop over list.length - 1 elements
		for(int currentIndex = 1; currentIndex < list.length; currentIndex++ )
			{
				int insert = list[currentIndex]; //value to insert
				int moveItem = currentIndex; 
				//search for place to put current element
				while (moveItem > 0 && list[moveItem - 1] > insert)
				{
					//shift element right one slot
					list[moveItem] = list[moveItem  - 1];
					moveItem--;
				}
				
				list[moveItem] = insert; // place inserted element
				printPass(list, currentIndex, moveItem); 

			}
	}
	
	public static void printPass(int[] list, int pass, int index)
	   {
	      System.out.printf("after pass %2d: ", pass);

	      // output elements till swapped item
	      for (int i = 0; i < index; i++)
	         System.out.printf("%d  ", list[i]);

	      System.out.printf("%d* ", list[index]); // indicate swap

	      // finish outputting array
	      for (int i = index + 1; i < list.length; i++)
	         System.out.printf("%d  ", list[i]);

	      System.out.printf("%n               "); // for alignment

	      // indicate amount of array that’s sorted
	      for(int i = 0; i <= pass; i++)
	         System.out.print("--  ");
	      System.out.println();
	   } 


}
