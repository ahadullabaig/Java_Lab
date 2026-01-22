import java.util.Scanner;

public class Employee
{
    String id;
    String name;
    int age;
    int salary;

    void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        id = sc.next();

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.print("Enter Salary: ");
        salary = sc.nextInt();
    }

    public static void main(String[]args)
    {
        Employee employees[] = new Employee[3];

        for(int i=0; i<3; i++)
        {
            employees[i] = new Employee();

            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            employees[i].accept();
        }

        // Sort employees by salary in ascending order
        for(int i=0; i < (employees.length - 1); i++)
        {
            for(int j=0; j < (employees.length - 1 - i); j++)
            {
                if(employees[j].salary > employees[j + 1].salary)
                {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }

        System.out.println("\nNames in order of salary:");

        for(Employee e : employees)
        {
            System.out.println(e.name);
        }
    }
}
