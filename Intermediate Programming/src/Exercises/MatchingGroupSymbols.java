import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MatchingGroupSymbols {

public static void main(String[] args) throws Exception {

GenericStack stack = new GenericStack<>();

Scanner input = new Scanner(new File("C:\\Users\\Baron\\Uni\\Uni\\Spring 2018\\Intermediate Programming\\Programs\\Orange.java"));

try {

while (input.hasNext()) {

String s = input.nextLine();

StringTokenizer tokens = new StringTokenizer(s, "[](){}", true);

while (tokens.hasMoreTokens()) {

String token = tokens.nextToken().trim();

if (token.length() == 0)

continue;

else if (token.charAt(0) == '[') {

stack.push(']');

}

else if (token.charAt(0) == '{') {

stack.push('}');

}

else if (token.charAt(0) == '(') {

stack.push(')');

}

else if (token.charAt(0) == ']' ||

token.charAt(0) == '}' ||

token.charAt(0) == ')') {

char ch = ((Character)(stack.pop())).charValue();

if (ch != token.charAt(0)) {

System.out.println("Exit 1: Incorrect grouping pairs");

System.exit(1);

}

}

}

}

if (!stack.isEmpty()) {

System.out.println("Exit 2: Incorrect grouping pairs");

System.exit(2);

}

}

catch (Exception ex) {

System.out.println("Exit 3: Incorrect grouping pairs");

}

System.out.println("Correct grouping pairs");

}

}