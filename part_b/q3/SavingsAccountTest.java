public class SavingsAccountTest
{
    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04); // Set to 4%

        System.out.println("Monthly Interest Calculation with 4% Annual Interest Rate:");
        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Saver 1 Balance:Rs. %.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 Balance:Rs. %.2f\n", saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05); // Set to 5%

        System.out.println("\nMonthly Interest Calculation with 5% Annual Interest Rate (Next Month):");

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Saver 1 Balance:Rs. %.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 Balance:Rs. %.2f\n", saver2.getSavingsBalance());
    }
}
