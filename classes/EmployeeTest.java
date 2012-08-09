public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[4];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tonny Tester", 40000, 1990, 3, 15);
        staff[3] = new Employee("Tom Whiler", 20000, 2010, 2, 20);

        for (Employee e : staff)
        {
            e.setId();
            e.raiseSalary(5);
        }

        for (Employee e : staff)
        {
            System.out.println("id=" + e.getId() + " name=" + e.getName() + ", salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }

        System.out.println("Employee class version: " + Employee.version);
        System.out.println("Employee next id: " + Employee.getNextId());
    }
}
