package Student;

public class StudentDetails
{
    String usn, dept, m1, m2, m3;
    double sgpa;

    public StudentDetails(String usn, String dept, String m1, String m2, String m3, double sgpa)
    {
        this.usn = usn;
        this.dept = dept;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.sgpa = sgpa;
    }

    public void display()
    {
        System.out.println("USN        : " + usn);
        System.out.println("Department : " + dept);
        System.out.println("M1 Grade   : " + m1);
        System.out.println("M2 Grade   : " + m2);
        System.out.println("M3 Grade   : " + m3);
        System.out.println("SGPA       : " + sgpa);
    }
}

