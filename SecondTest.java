import java.util.*;
import java.io.*;

public class SecondTest
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //System.out.println("This is small");
        
        //Scanner in = new Scanner(new File("myfile.txt"));

        //String line;

        //line = in.nextLine();
        //System.out.println(line);

        //line = in.nextLine();
        //System.out.println(line);

        //line = in.nextLine();
        //System.out.println(line);

        int age = 24;

        switch (age)
        {
            case 1:
                System.out.println("Age is 1");
                break;
            case 25:
                System.out.println("Age is 25");
                break;
            default:
                System.out.println("Age is something else");
                break;
        }

        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
        {
            a[i] = i*2;
        }

        for (int i = 0; i < a.length; i++)
        {
            System.out.println("From array: " + a[i]);
        }

        for (int element : a)
        {
            System.out.println("From array, using collection: " + element);
        }

        int[] smallPrimes = { 2, 5, 5, 7 };
        int[] luckyNumbers = smallPrimes;
        luckyNumbers[1] = 8;
        System.out.println("smallPrimes[1] " + smallPrimes[1]);

        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        copiedLuckyNumbers[1] = 10;

        System.out.println("copiedLuckyNumbers[1] " + copiedLuckyNumbers[1]);
        System.out.println("luckyNumbers[1] " + luckyNumbers[1]);


        //while (age > 10)
        //{
        //    System.out.printf("Age is now %d \n", age);
        //    age--;
        //}

        //do
        //{
        //    System.out.printf("Age is now %d \n", age);
        //    age--;
        //}
        //while (age > 10);

        //for (int i = 1; i <= 10; i++)
        //{
        //    System.out.printf("Counter is %d \n", i);
        //}

        /*
        if (age < 5)
        {
            System.out.println("Less than age");
        }
        else if (age >= 5 && age <= 15)
        {
            System.out.println("Between age");
        }
        else
        {
            System.out.println("More than age");
        }
        */
    }
}
