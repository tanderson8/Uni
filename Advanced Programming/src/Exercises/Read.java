import java.io.File;
import java.util.Scanner;

public class Read {

    public static void main(String[] args) throws Exception{
        File file = new File("C:/Users/Baron/Uni/Uni/Fall 2018/Advanced Programming/Programs/Exercises/states.txt");
                Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }

}
