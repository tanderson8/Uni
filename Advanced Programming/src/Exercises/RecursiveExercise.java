import java.util.ArrayList;
import java.util.Stack;

public class RecursiveExercise {

    public static void main(String[] args) {
        printBinary(0,"");
    }

    public static void printBinary(int n, String str) {
        if (n == 5) {
            System.out.println(str);
            return;
        }
        printBinary(n+1,str + "0");
        printBinary(n+1,str + "1");
    }
    // write a iterative version of printBinary
    // create a stack and push 1 and 0
    // pop them and append 1 and 0 , add to arraylist
    // empty arraylist and push to stack repeat...
    public static void printBinaryIterative(int n) {
       Stack<String> stack = new Stack<String>();
       ArrayList<String> temp = new ArrayList<String>();
       stack.push("0");
       stack.push("1");
       for (int i = 0; i < n; i++) {
                 
       }
    }


}
