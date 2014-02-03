import java.util.*;

public class FirstArray
{
    public static void main(String[] args)
    {
        System.out.println("Hello there");

        int[] a = new int[15];

        for (int i = 0; i < a.length; i++)
        {
            a[i] = i;
            System.out.println(i + ": " + a[i]);
            //System.out.printf("%d: (%d)\n", i, a[i]);
        }

        for (int element : a) 
        {
            System.out.println("printing element: " + element);
        }

        System.out.println(Arrays.toString(a));

        int[] smallPrimes = { 2, 3, 5, 7 };
        for (int element : smallPrimes) 
        {
            System.out.println("small prime: " + element);
        }

        // to avoid referring to the same array we need to use Arrays.copyOf
        int[] luckyNumbers = Arrays.copyOf(smallPrimes, smallPrimes.length);
        luckyNumbers[0] = 100;
        System.out.println(Arrays.toString(luckyNumbers));
        System.out.println(Arrays.toString(smallPrimes));


    }
}
