import java.util.*;

class Employee
{
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
        setId();
    }

    public String getName()
    {
        return name;
        // test calling private method
        //return getInternalName();
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    public Date getHireDay()
    {
        //return hireDay;
        // return a clone to avoid returning a reference to a mutable object
        return (Date) hireDay.clone();
    }

    // This can only be used from inside this class, it's private
    private String getInternalName()
    {
        return "Slow " + name;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    private void setId()
    {
        id = nextId;
        nextId++;
    }

    public static int getNextId()
    {
        // static methods can only access static fields
        return nextId;
    }

    public static int sum(int a, int b)
    {
        // static method can only access explicit parameters
        return a + b;
    }

    public static void main(String[] args)
    {
        System.out.println("I could run unit tests for the Employee class here");
    }

    private int id;
    private static int nextId = 1;
    private final String name;
    private double salary;
    private Date hireDay;
}
