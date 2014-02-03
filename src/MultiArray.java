import java.util.*;

public class MultiArray
{
    public static void main(String[] args)
    {
        System.out.println("The code will go here");

        double[][] balances;
        balances = new double[5][3];
        // or simply use this
        //double[][] balances = new double[5][3];

        int[][] magicNumbers = 
        {
            {2, 4, 6, 8},
            {1, 10, 100, 1000},
            {3, 6, 9, 12}
        };

        //System.out.println(magicNumbers.length);
        for (int i = 0; i < magicNumbers.length; i++)
        {
            for (int j = 0; j < magicNumbers[i].length; j++)
            {
                System.out.println("row " + i + " column " + j + " : " + magicNumbers[i][j]);
            }
        }

        System.out.println(Arrays.deepToString(magicNumbers));

    }
}

