public class ExceptionDemo
{
    public static void main(String[]args)
    {
        int arr[] = {1, 2, 3, 4};

        try
        {
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Caught " + e);
        }
        catch(Exception e)
        {
            System.out.println("Caught " + e);
        }
        finally
        {
            System.out.println("Program Succesfully Exceuted.");
        }
    }
}

