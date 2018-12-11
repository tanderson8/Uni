import java.util.ArrayList;

public class GenericStackDemo extends GenericStack{
	
	public static void main(String[] args) {
		GenericStack<String> stack1 = new GenericStack<>();
		stack1.push("Ta'im Anderson");
		stack1.push("Jason Marcacci");
		stack1.push("Bruccy Pimentel Aquino");
		stack1.push("Rashid Lowe");
		stack1.push("Juan Linares");
		
		System.out.println(stack1.getSize());
		System.out.println(stack1.peek());
		System.out.println(stack1.pop());
		System.out.println(stack1.getSize());
		System.out.println(stack1);

	}
}


