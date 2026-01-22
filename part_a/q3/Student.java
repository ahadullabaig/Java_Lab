import java.util.Scanner;

public class Student
{
    String usn;
    String name;
    int m1, m2, m3;

    void accept(Scanner sc)
    {
        System.out.println("enter the usn: ");
        usn = sc.next();

        System.out.println("enter the name: ");
        name = sc.next();

        System.out.println("enter the marks for subject 1: ");
        m1 = sc.nextInt();

        System.out.println("enter the marks for subject 2: ");
        m2 = sc.nextInt();

        System.out.println("enter the marks for subject 3: ");
        m3 = sc.nextInt();
    }

    void display()
    {
        System.out.println("USN: " + usn);
        
        System.out.println("Name: " + name);
        
        System.out.println("Marks for subject 1: " + m1);
        
        System.out.println("Marks for subject 2: " + m2);

        System.out.println("Marks for subject 3: " + m3);
    }
}
