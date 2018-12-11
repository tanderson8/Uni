import java.util.HashMap;
import java.util.TreeMap;

public class HashExample {

    public static void main(String[] args) {
        String college = "Georgia Gwinnett College";
        System.out.println(college.hashCode() % 16);
        //HashMap<String,String> heroes = new HashMap<String,String>();
        TreeMap<String, String> heroes = new TreeMap<String, String>();
        heroes.put("dr.im", "professor cool guy");
        heroes.put("thanos", "villian bad guy");
        heroes.put("ant man", "has a cool name");
        System.out.println(heroes);
        System.out.println(heroes.get("dr.im"));

        for(String key: heroes.keySet()) {
            System.out.println("Hero: " + key + " " + heroes.get(key));
        }
    }
}
