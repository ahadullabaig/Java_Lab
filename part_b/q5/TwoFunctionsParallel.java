class Prime extends Thread
{
    public void run()
    {
        System.out.println("Printing Prime Numbers Between 1 to 100:");

        for(int i=2; i<=100; i++)
        {
            int count = 0;

            for(int j=1; j<=i; j++)
                if(i%j == 0)
                    count++;

            if(count == 2)
            {
                System.out.println(i + " is a Prime number.");
                try
                {
                    Thread.sleep(500);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}

class Even extends Thread
{
    public void run()
    {
        System.out.println("Printing Numbers Divisible by 2, 4, and 6 Between 1 to 100:");

        for(int i=1; i<=100; i++)
        {
            if(i%2 == 0 && i%4 == 0 && i%6 == 0)
            {
                System.out.println(i);
                try
                {
                    Thread.sleep(500);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}

public class TwoFunctionsParallel
{
    public static void main(String[]args)
    {
        Prime t1 = new Prime();
        Even t2 = new Even();

        t1.start();
        t2.start();
    }
}

