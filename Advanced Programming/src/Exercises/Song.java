import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;
import java.util.HashSet;

public class Song {
    private String name;
    private int time;
    private String genre;

    @Override
    public int hashCode() {
        // don't check for null in test
        int hash = 31;
        hash += 17 * name.hashCode();
        hash += 17* ((Integer) time).hashCode();
        hash += 17* genre.hashCode();
        return hash;
    }


    public static void main(String[] args) {
        /*
        HashMap<Integer,String> words = new HashMap<Integer,String>();
        while(true) {
            String str = RandomStringUtils.randomAlphabetic(3);
            if( words.containsKey(str.hashCode())) {
                System.out.println("Collision detected");
                System.out.println(str + " " + str.hashCode());
                System.out.println(words.get(str.hashCode()) + " " + str.hashCode());
            } else {
                words.put(str.hashCode(), str);
            }
        }
        */
        System.out.println("IHp".hashCode());
        System.out.println("HhQ".hashCode());
    }
}
