import java.util.ArrayList;

public class LambdaExample2 {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("1");
        nums.add("7");
        nums.add("-1");
        nums.add("100");
        System.out.println(parseIntList(nums));
    }

    public static ArrayList<Integer> parseIntList(ArrayList<String> list){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        list.forEach(e -> nums.add(Integer.parseInt(e)));
        return nums;
    }


}
