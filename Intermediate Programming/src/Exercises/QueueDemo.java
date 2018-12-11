import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {

	public static void main(String[] args) {

		int[] list = {1, 3, 10, 12, 2, 4};

		Queue<Integer> queueList = new LinkedList<>();
		
		for(Integer e: list) {
			queueList.add(e);
		}
		
		System.out.println("QUEUE = " + queueList);
		System.out.println("PEEK = " + queueList.peek());
		
		while(!queueList.isEmpty()) {
			System.out.print(queueList.remove());
		}
		
		System.out.println();
	}

}



