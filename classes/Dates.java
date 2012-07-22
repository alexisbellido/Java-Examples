import java.util.*;

public class Dates
{
    public static void main(String[] args)
    {
        Date birthday = new Date();
        System.out.println(birthday.toString());

        //GregorianCalendar newYear = new GregorianCalendar(2013, Calendar.JANUARY, 1);
        //System.out.println(newYear.toString());

        GregorianCalendar deadline = new GregorianCalendar();
        int month = deadline.get(Calendar.MONTH);
        int weekday = deadline.get(Calendar.DAY_OF_WEEK);

        System.out.println("month: " + month + " " + deadline.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US));
        System.out.println("weekday: " + weekday);

        deadline.set(Calendar.MONTH, Calendar.SEPTEMBER);
        System.out.println("month: " + month + " " + deadline.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US));

    }
}
