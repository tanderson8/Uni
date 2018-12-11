import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {

        ArrayList<Double> nums = new ArrayList<Double>();
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter number: ");
            double score = Double.parseDouble(keyboard.nextLine().trim());
            nums.add(score);
        }
        double max = nums.get(0);
        for (int i = 0; i < 5; i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        System.out.println("The highest score is " + max);
        System.out.printf("%d",max);
    }


}
