import java.util.ArrayList;

public class GenericStack<E> {

	private ArrayList<E> list = new ArrayList<>();
	
	
	public int getSize() {
		
		return list.size();
	}
	
	//Returns the top element in stack
	public E peek() {
		
		return list.get(getSize()-1);
	}
	
	//adds element to the top of element in stack
	public void push(E o) {
		list.add(o);
	}
	
	//Removes the top element in stack
	public E pop() {
		
		E o = list.get(getSize() - 1);
		list.remove(getSize()-1);
		return o;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public String toString() {
		
		return "stack: " + list.toString();
	}
	public static void main(String[] args) {
		list.add("lsifs");

	}
}

