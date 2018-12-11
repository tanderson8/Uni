import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDupDemo {

	public static void main(String[] args) {

		Scanner name = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter duplicate numbers");
		
		for(int i = 0; i < 10; i++) {
			list.add(name.nextInt());
		}
		
		removeDupes(list);
		System.out.println(list.toString());
	}
	
	public static<E> ArrayList<E> removeDupes(ArrayList<E> list){
		
		for(int i = 0; i <list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if(list.get(i) == list.get(j))
					list.remove(j);
			}
		}
		
		return list;
	}
	
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
	{
		for(int i = 0; i < list.length; i++) {
			if(list[i].compareTo(key) == 0)
				return i;
		}
		
		return -1;
	}

	public static<E> ArrayList<E> removeDuplicates(ArrayList<E> list){
		boolean found = false;
		if(list.size() == 0)
			return list;
		ArrayList<E> newList = new ArrayList<E>();
		newList.add(list.get(0));
		
		for(int i = 1; i < list.size(); i++) {
			for(int j = 0; j < newList.size(); j++) {
				
			if(list.get(i) == newList.get(j)){
				
			found = true;
			break;
			}
			
			if(found != true) {
				newList.add(list.get(i));
				found = false;
			}
	}
}
		return newList;
		}
}
