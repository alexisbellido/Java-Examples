import java.util.*;

public class ArrayAgain
{
    public static void main(String[] args)
    {
        System.out.println("Ready");

        //int month;
        //month = 12;
        //int age = 15;

        //System.out.println("month " + month);
        //System.out.println("age " + age);

        //int a[] = new int[100];

        //int b[];
        //b = new int[20];

        //for (int i = 0; i < b.length; i++)
        //{
        //    b[i] = i;
        //}

        //for (int i = 0; i < b.length; i++)
        //{
        //    System.out.println("b[i] " + b[i]);
        //}

        //for (int element : b)
        //{
        //    System.out.println("element " + element);
        //}

        //System.out.println("Arrays.toString(b) " + Arrays.toString(b));

        int[] smallPrimes = { 7, 5, 2, 3 };
        System.out.println("Arrays.toString(smallPrimes) " + Arrays.toString(smallPrimes));

        Arrays.sort(smallPrimes);
        System.out.println("Arrays.toString(smallPrimes) " + Arrays.toString(smallPrimes));

        //System.out.println("Arrays.toString(args) " + Arrays.toString(args));
    }

}
