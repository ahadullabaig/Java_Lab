import Student.StudentDetails;
import Staff.StaffDetails;

public class Details
{
    public static void main(String[]args)
    {
        StudentDetails s1 = new StudentDetails("1MS24AI006", "AI/ML", "A+", "O", "A+", 8.85);
        s1.display();

        StaffDetails s2 = new StaffDetails("Kalyan Chakravarthy", "1MS10MA010", "Mathematics Professor", "Calculus 1, 2, 3, and 4");
        s2.display();
    }
}

