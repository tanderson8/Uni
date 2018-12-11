import java.util.Scanner;
import java.util.ArrayList;

public class RemoveDup {
  public static void main(String[] args) {
	  
	//Use sentinel value to end
    System.out.print("Enter integer numbers and enter 0 to end: ");
    ArrayList<Integer> list = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    int number; 
    do {
    	number = input.nextInt();
    	if(number !=0)
    		list.add(number);
    }while(number != 0);
 
    
    
    removeDuplicate(list);
    
    System.out.print("The distinct integers are ");
    for (int i = 0; i < list.size(); i++)
      System.out.print(list.get(i) + " ");
  }

  public static void removeDuplicate(ArrayList<Integer> list) {
    ArrayList<Integer> temp = new ArrayList<>();
    for (int i = 0; i < list.size(); i++)
      if (!temp.contains(list.get(i)))
        temp.add(list.get(i));

    list.clear();
    for (int i = 0; i < temp.size(); i++)
      list.add(temp.get(i));
  }
}