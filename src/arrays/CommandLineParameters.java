public class CommandLineParameters
{
    public static void main(String[] args)
    {
        if (args[0].equals("-h"))
        {
            System.out.print("Hello,");
        }
        else if (args[0].equals("-g"))
        {
            System.out.print("Bye,");
        }

        for (int i = 1; i < args.length; i++)
        {
            System.out.print(" " + args[i]);
        }

        System.out.println("!");
    }
}
