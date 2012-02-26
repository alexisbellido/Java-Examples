import java.util.*;

public class MyArgs
{
    public static void main(String[] args)
    {
        //for (String arg : args)
        //{
        //    System.out.println("The arg: " + arg);
        //}

        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number to draw? ");
        int n = in.nextInt();

        // fill array with numbers from 1 to n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
            // get random number between 0 and n-1
            int r = (int) (Math.random() * n);

            // pick element from numbers at random location
            result[i] = numbers[r];

            // move last element into random location
            numbers[r] = numbers[n - 1];
            n--;
        }

        Arrays.sort(result);
        System.out.println("This is the winner combination");
        System.out.println(Arrays.toString(result));
        
    }
}
