import java.util.Scanner;

/**
 * Created by Leon on 4.8.2017..
 */

public class Prompter {


    public static String getInput(String message) {
        Scanner reader = new Scanner(System.in);
        System.out.printf(message);
        return reader.next();
    }


    public static void pressEnter(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Ready? (press ENTER to start guessing");
        reader.nextLine();
    }
}
