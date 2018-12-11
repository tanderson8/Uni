import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {


		String [] list = {"Alabama", "Georgia", "New York", "Florida"};
		Stack<String> stackList = new Stack<>();

		for(String e: list) {
			stackList.push(e);
		}
		
		System.out.println("Stack = " + stackList);
		System.out.println("Size = " + stackList.size());
		System.out.println("PEEK = " + stackList.peek());

		while(stackList.size() > 0) {
			stackList.pop();
		}
		
		System.out.println("Stack = " + stackList);
	}

}
