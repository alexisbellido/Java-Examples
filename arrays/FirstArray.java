public class FirstArray
{
    public static void main(String[] args)
    {
        System.out.println("Hello there");

        int[] a = new int[10];

        for (int i = 0; i < 10; i++)
        {
            a[i] = i;
            System.out.println(i + ": " + a[i]);
            //System.out.printf("%d: (%d)\n", i, a[i]);
        }


        //System.out.println(a[2]);
    }
}
