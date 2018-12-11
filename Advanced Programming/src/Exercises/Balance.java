import java.util.Scanner;
import java.util.Stack;

public class Balance {


    public static boolean parenthesesAreBalanced(String sentence) {
        Stack<Character> parentheses = new Stack<Character>();
        for (int i = 0; i < sentence.length(); i++) {
            char pare = sentence.charAt(i);
            if (pare == '(') {
                parentheses.push(pare);
            } else if (pare == ')') {
                if (parentheses.isEmpty() || parentheses.pop() != '(') {
                    return false;
                }
            }


        }
        return parentheses.isEmpty();
    }

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a sentence:");

            if (parenthesesAreBalanced(userInput.nextLine())) {
                System.out.println("The sentence is balanced.");
            }
            else {
                System.out.println("The sentence is not balanced.");
            }

            System.out.println("Type enter to continue or quit to exit");
            String continueEnd = userInput.nextLine();
            if (continueEnd.startsWith("quit")) {
                break;
            }
        }
    }
}