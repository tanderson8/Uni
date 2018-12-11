import java.util.*;

public class Client1 {

	public static void main(String[] args) {

		//construct two lists
		ArrayIntList list1 = new ArrayIntList();
		ArrayIntList list2 = new ArrayIntList();
		
		//add 1,82, 97, to list 1
		list1.add(1);
		list1.add(82);
		list1.add(97);
		
		//add 1,82, 97, to list 1
		list2.add(7);
		list2.add(-8);
				
		//report result
		System.out.println("list 1 = " + list1);
		System.out.println("list 2 = " + list2);

	}

}
