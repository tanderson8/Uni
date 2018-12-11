import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {

        
    	int[] array = new int[100];
        
    	for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    	
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an index: ");
        
        try {
            int index = input.nextInt();
            System.out.println("Index #" + index + " corresponds to the number " + array[index] + " in the array");
        } 
        
        catch (IndexOutOfBoundsException exception) {
            System.out.println("Out of Bounds");
        } 
        
        catch (Exception exception) {
            System.out.println("Out of Bounds");
        }
    }
}