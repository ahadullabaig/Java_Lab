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

class All extends Thread
{
    public void run()
    {
        System.out.println("Printing All Numbers Between 100 to 200:");

        for(int i=100; i<=200; i++)
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

public class TwoFunctionsParallel
{
    public static void main(String[]args)
    {
        Prime t1 = new Prime();
        All t2 = new All();

        t1.start();
        t2.start();
    }
}
