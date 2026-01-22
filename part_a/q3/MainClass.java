import java.util.Scanner;

class UG_Student extends Student
{
    int ToS;

    void accept(Scanner sc)
    {
        super.accept(sc);

        System.out.println("enter the total no of semesters: ");
        ToS = sc.nextInt();
    }

    void display()
    {
        super.display();

        System.out.println("Total no of semesters: " + ToS);
    }
}

class PG_Student extends Student
{
    int ToS;

    void accept(Scanner sc)
    {
        super.accept(sc);

        System.out.println("enter the total no of semesters: ");
        ToS = sc.nextInt();
    }

    void display()
    {
        super.display();

        System.out.println("Total no of semesters: " + ToS);
    }
}

public class MainClass
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        UG_Student ug[] = new UG_Student[3];

        for(int i=0; i<3; i++)
        {
            ug[i] = new UG_Student();

            ug[i].accept(sc);
        }

        PG_Student pg[] = new PG_Student[3];

        for(int i=0; i<3; i++)
        {
            pg[i] = new PG_Student();
            
            pg[i].accept(sc);
        }
        
        sc.close();

        System.out.println("UG Students: ");

        for(int i=0; i<3; i++)
        {
            ug[i].display();;
        }

        System.out.println("PG Students: ");

        for(int i=0; i<3; i++)
        {
            pg[i].display();;
        }
    }
}
