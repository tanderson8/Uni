import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
    /*    HashMap<String,String> states = new HashMap<String,String>();
        states.put("ga","georgia");
        states.put("ny","new york");
        states.put("ca","california");
        states.put("tx","texas");
        states.put("sc","south carolina");
        System.out.println(states.get("ga"));
        System.out.println(states.containsKey("la"));
        System.out.println(states.containsKey("tx"));
        states.remove("tx");
        for(String key: states.keySet()){
            System.out.println(key + " " + states.get(key));

            TreeMap<String,String> states = new TreeMap<String,String>();
            states.put("ga","georgia");
            states.put("ny","new york");
            states.put("ca","california");
            states.put("tx","texas");
            states.put("sc","south carolina");
            System.out.println(states.get("ga"));
            System.out.println(states.containsKey("la"));
            System.out.println(states.containsKey("tx"));
            states.remove("tx");
            for(String key: states.keySet()){
                System.out.println(key + " " + states.get(key));*/

                LinkedHashMap<String,String> states = new LinkedHashMap<String,String>();
                states.put("ga","georgia");
                states.put("ny","new york");
                states.put("ca","california");
                states.put("tx","texas");
                states.put("sc","south carolina");
                System.out.println(states.get("ga"));
                System.out.println(states.containsKey("la"));
                System.out.println(states.containsKey("tx"));
                states.remove("tx");
                for(String key: states.keySet()){
                    System.out.println(key + " " + states.get(key));
        }

    }
}
