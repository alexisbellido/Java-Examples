import java.util.*;

/**
 * My first Java program
 * @version 0.1 2011-02-22
 * @author Alexis Bellido
 */
public class MyTest
{
    public static void main(String[] args)
    {
        double salary;
        int age = 42;
        int num = 81;

        final double PI = 3.14; // This is a constant
        salary = 8800.50;
        Size s = Size.SMALL;
        String greeting = "hello";

        /*
        if (s == Size.SMALL) {
            System.out.println("This is small");
        } else {
            System.out.println("This is not small");
        }


        System.out.println("Testing here, salary " + salary + " age " + age);
        System.out.println(greeting + ", PI is " + PI);
        System.out.println("Square root is " + Math.sqrt(num));

        String ss = greeting.substring(0, 3);
        System.out.println(ss);

        System.out.println("test");
        System.out.println("hello".equals(greeting));
        System.out.println("NOhello".equals(greeting));

        System.out.println(greeting.charAt(0));
        System.out.println(greeting.toUpperCase());

        char space = ' ';
        char myLetter = 'x';

        StringBuilder builder = new StringBuilder();
        builder.append(greeting);
        builder.append(space).append("John");
        builder.append(myLetter);
        String completedString = builder.toString();
        System.out.println(builder);
        */
        
        System.out.printf("hola %d", 1);  

        Scanner in = new Scanner(System.in);

        System.out.print("What is your name? ");
        String yourName = in.nextLine();

        System.out.print("What is your age? ");
        int yourAge = in.nextInt();

        System.out.println("Hello " + yourName + "!, you are " + yourAge + " years old.");

        double x = 1000.0 / 3.0;
        System.out.println(x);
        System.out.printf("%8.2f \n", x);
        System.out.printf("%.2f \n", x);
        System.out.printf("Hello %s, next year you will be %d \n", "Mike", 23);
        System.out.printf("%1$s %2$tB %2$te, %2$tY \n", "Due date:", new Date());
        System.out.printf("%s %tB %<te, %<tY \n", "Again, due date:", new Date());

        String msg = String.format("the x is %8.2f \n", x);
        System.out.println(msg);

    }

    enum Size { SMALL, MEDIUM, LARGE };
    public static final int YEAR = 1972; // This is a class constant that will be accessed as MyTest.YEAR
}