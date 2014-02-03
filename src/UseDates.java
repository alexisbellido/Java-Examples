import java.util.*;

public class UseDates
{
    public static void main(String[] args)
    {
        System.out.println(new Date());

        String s = new Date().toString();
        System.out.println("The date in string is " + s);

        Date birthday = new Date();
        System.out.println("The date of the birthday in string is " + birthday.toString());

        GregorianCalendar deadline = new GregorianCalendar(2012, Calendar.FEBRUARY, 23);
        System.out.println("The deadline month is " + deadline.get(Calendar.MONTH));
        System.out.println("The deadline day of the week is " + deadline.get(Calendar.DAY_OF_WEEK));
        System.out.println("The deadline day of the month is " + deadline.get(Calendar.DAY_OF_MONTH));

        deadline.set(Calendar.MONTH, Calendar.DECEMBER);

        System.out.println("The deadline month has changed to " + deadline.get(Calendar.MONTH));
    }
}

