import MyPack.BankCustomer;

public class MainClass
{
    public static void main(String[]args)
    {
        BankCustomer c1 = new BankCustomer("Ahad", 1000000);
        c1.display();

        System.out.println();

        BankCustomer c2 = new BankCustomer("Ayaan", 5000000);
        c2.display();
    }
}
