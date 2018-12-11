import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OverwriteKVExample {

    public static void main(String[] args) {
        Map<String,String> people = new TreeMap<String,String>();
        people.put("remy","osbrone");
        people.put("remy","martin");
        people.put("wes","mcmilan");
        people.put("johnas","newsome");
        System.out.println(people);
    }
}
