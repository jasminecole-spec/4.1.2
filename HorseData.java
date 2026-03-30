/* 
 * Activity 4.1.2
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HorseData
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("horsedata.txt"));

        String name;
        int weight;
        double age;
        boolean newInBarn;
        int sumWeight = 0;
        double sumAge = 0.0;
        int i;
        double totalHay = 0.0;
        for (i = 0; sc.hasNextLine(); i++)
        {
            name = sc.next();
            weight = sc.nextInt();
            age = sc.nextDouble();
            newInBarn = sc.nextBoolean();
            sumWeight += weight;
            sumAge += age;
            totalHay += (weight * 2.5);
            if (newInBarn == true)
            {
                System.out.println("(NEW) " + name + " weighs " + weight + " at " + age + " years old.");
            }
            else
            {
                System.out.println(name + " weighs " + weight + " at " + age + " years old.");
            }  
        }
        System.out.println("Average weight: " + sumWeight/i);
        System.out.println("Average age: " + sumAge/i);
        System.out.println("Total hay needed: " + totalHay);
    }
}