import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Scores {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        while (true) {
            System.out.println("Please Enter a Number: ");
            int number = userInput.nextInt();
            minHeap.add(number);
            maxHeap.add(number);
            System.out.println("The Biggest Number Was: " + maxHeap.peek());
            System.out.println("The Smallest Number Was: " + minHeap.peek());
        }
    }
}