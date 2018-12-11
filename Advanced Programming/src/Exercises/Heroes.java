import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class Heroes {

    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new File("./heroes.txt"));
        TreeMap<String, String> heroList = new TreeMap<String, String>();

        while (true) {

            //Enter Name of Hero
            System.out.println("Please enter name of hero:");
            String hero = userInput.nextLine();

            //Enter Name of Hometown
            System.out.println("Please enter home town of hero:");
            String homeTown = userInput.nextLine();
            heroList.put(hero, homeTown);

            //Loop Stop When User Types "quit"
            System.out.println("Type quit to end or enter to continue:");
            String input = userInput.nextLine();
            if (input.startsWith("quit")) {
                break;
            }
        }

        //Print The Hero and Hometown To A Text File
        for (Map.Entry<String, String> en : heroList.entrySet()) {
            pw.println(en.getKey() + ":" + en.getValue());
        }

        userInput.close();
        pw.close();

    }

}
