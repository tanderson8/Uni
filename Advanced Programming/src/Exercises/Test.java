import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        printNums();

        ArrayList<String> names = new ArrayList<String>();
        names.add("bart");
        names.add("lisa");
        names.add("homer");
        System.out.println(reverseStrings(names));
        String str = "alphabet";
        System.out.println(firstUniqueChar(str));
    }

    public static int numOfUniqueNames(ArrayList<String> names) {
        HashSet<String> set = new HashSet<String>();
        for (String name : names) {
            set.add(name);
        }
        return set.size();
    }

    public static void printNums() {
        int i = 10000;

        while (i >= 0) {
            System.out.println(i);
            i -= 10;
        }
    }

    public static ArrayList<String> reverseStrings(ArrayList<String> names) {
        ArrayList<String> r = new ArrayList<String>();
        for (int i = names.size() - 1; i >= 0; i++) {
            r.add(names.get(i));
        }
        return r;
    }


    public static char firstUniqueChar(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), count + 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }
        return str.charAt(0);
    }
}