package Staff;

public class StaffDetails
{
    String StaffName, StaffID, designation, subjects;

    public StaffDetails(String StaffName, String StaffID, String designation, String subjects)
    {
        this.StaffName = StaffName;
        this.StaffID = StaffID;
        this.designation = designation;
        this.subjects = subjects;
    }

    public void display()
    {
        System.out.println("Name        : " + StaffName);
        System.out.println("ID          : " + StaffID);
        System.out.println("Designation : " + designation);
        System.out.println("Subjects    : " + subjects);
    }
}

