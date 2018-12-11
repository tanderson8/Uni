
public class StringRecursively {

	public static void main(String[] args) {
		printVertical("A string is a recursive data structure");

	}
	public static void printVertical(String str) {
		if((str == null) || str.equals("")){
		return;
	}
	
	else {
		System.out.println(str.charAt(0));
		printVertical(str.substring(1));
	}
	
}
}
