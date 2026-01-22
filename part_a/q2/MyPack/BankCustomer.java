package MyPack;

public class BankCustomer
{
    String name;
    double balance;

    public BankCustomer(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }
}

