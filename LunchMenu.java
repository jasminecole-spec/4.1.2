/*
 * Activity 4.1.2
 */
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class LunchMenu
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("lunches.txt"));

        String str;
        String[] tokens;
        int numTimes = 0;
        ArrayList<String> lunches2 = new ArrayList<>();
        ArrayList<String> lunches3 = new ArrayList<>();

        while (sc.hasNext())
        {
            str = sc.nextLine();
            tokens = str.split(": ");
            numTimes = Integer.parseInt(tokens[1]);

            if (numTimes == 2)
            {
                lunches2.add(tokens[0]);
            }
            if (numTimes == 3)
            {
                lunches3.add(tokens[0]);
            }
        }
        System.out.println("Served twice a month:");
        System.out.println(lunches2);
        System.out.println();
        System.out.println("Served three times a month:");
        System.out.println(lunches3);
        sc.close();
    }
}