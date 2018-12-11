import java.util.ArrayList;

public class SortArrayList {
  public static void main(String[] args) {

    ArrayList<Double> Double = new ArrayList<>();
    Double.add(5.10);
    Double.add(7.43);
    Double.add(6.45);
    Double.add(23.01);
    Double.add(93.12);
    Double.add(74.42);
    Double.add(20.47);
    Double.add(98.42);
    Double.add(55.55);
    Double.add(599.04);

    ArrayList<String> Animal = new ArrayList<>();
    Animal.add("Chicken");
    Animal.add("Pig");
    Animal.add("Eagle");
    Animal.add("Octopus");
    Animal.add("Alligator");
    Animal.add("Puma");
    Animal.add("Tiger");
    Animal.add("Hippo");
    Animal.add("Cassowary");
    Animal.add("Frog");

    sort(Double);
    sort(Animal);

    printList(Double);
    printList(Animal);
  }
  
  public static <E extends Comparable<E>> void sort(ArrayList<E> list){
    for (int i = 1; i < list.size(); i++ ){
      
    	E input = list.get(i);
      
    	int temp = i;
      
    	while (temp > 0 && list.get(temp - 1).compareTo(input) > 0){
    		
        list.set(temp, list.get(temp - 1));
        
        temp--;
      }
      
    	list.set(temp, input);
    }  
  }

  public static <E> void printList(ArrayList<E> list){
	  
    for (int i = 0; i < list.size(); i++){
      
    	System.out.println(list.get(i));
    }
  }
}
