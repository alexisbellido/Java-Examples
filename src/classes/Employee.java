import java.util.*;

class Employee
{
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        // GregorianCalendar uses 0 for January
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        hireDay = calendar.getTime();
    }

    public static void main(String[] args)
    {
        System.out.println("I can run unit tests for the Employee class here");
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public Date getHireDay()
    {
        // return a clone of a mutable object to avoid breaking encapsulation
        return (Date) hireDay.clone();
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public void setId()
    {
        id = nextId;
        nextId++;
    }

    public static int getNextId()
    {
        return nextId; // returns static field
    }

    private String name;
    private double salary;
    private Date hireDay;
    private int id;
    private static int nextId = 1;
    public static final double version = 1.25;
}
