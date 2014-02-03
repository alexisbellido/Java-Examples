public class EmployeeTest
{
    public static void main(String[] args)
    {
        System.out.println("The code will go here");

        // fill array with Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        //staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[1] = new Employee("Tommy Boy");
        //staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        staff[2] = new Employee();

        for (Employee e : staff)
        {
            e.raiseSalary(5);
        }

        for (Employee e : staff)
        {
            System.out.println("id: " + e.getId() + " name: " + e.getName() + " salary: " + e.getSalary() + " hireDay: " + e.getHireDay());
        }

        System.out.println(Employee.getClassNextId()); // calling a static method, which can only work with static fields in its class
        System.out.println(Employee.sum(25, 22)); // calling a static method, all parameters explicit

    }
}
