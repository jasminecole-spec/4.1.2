/* 
 * Activity 4.1.2
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PracticeSchedule
{
    public static void main(String[] args) throws IOException
    {
      Scanner sc1 = new Scanner(new File("schedule2.csv"));
      
      String str;
      String[] tokens;
      double hours = 0;
      double totalHours = 0;
      int index = 0;
      
      sc1.nextLine();
      while (sc1.hasNext()) {
        index++;
        str = sc1.nextLine();
        tokens =  str.split(",");
        hours = Double.parseDouble(tokens[1]);
        totalHours += hours;
        System.out.println(tokens[0] + " I practice " + hours  + " hours.");
      }
      System.out.println("Total amount of practice per week: " + totalHours);
      System.out.println("Average amount of practice per day: " + totalHours/index);
      
      sc1.close();
        
    }
}