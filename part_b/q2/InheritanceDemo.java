class InheritanceDemo
{
    public static void main(String[] args)
    {
        System.out.println("\n--- Creating MyTwoWheeler Object ---");
        MyTwoWheeler myBike = new MyTwoWheeler(2023, true, "Yamaha", 1500.0, "4 stroke", "Blue", "Ahad");
        myBike.getData();
        myBike.putData();

        System.out.println("\n--- Creating FourWheeler Object ---");
        FourWheeler myCar = new FourWheeler(2020);
        myCar.getData();
        myCar.putData();

        // --- Demonstrating Errors ---

        System.out.println("\n--- Demonstrating Errors ---");

        // Error 1: Instantiating Abstract Class
        System.out.println("\nAttempting to instantiate Abstract Class 'Vehicle'...");
        try 
        {
            // Vehicle v = new Vehicle(2022); // This is a compile-time error.
            // Using reflection to demonstrate runtime behavior or simply stating it cannot be done directly.
            // Since we can't compile "new Vehicle()", specific runtime check via reflection is a way to show "it's abstract".
            Class<?> clazz = Vehicle.class;
            clazz.newInstance(); 
        } 
        catch (InstantiationException e) 
        {
            System.out.println("Caught Exception: " + e);
            System.out.println("Explanation: Cannot instantiate abstract class 'Vehicle'.");
        } 
        catch (IllegalAccessException e) 
        {
            System.out.println("Caught Exception: " + e);
        }

        // Error 2: Inheriting from Final Class
        System.out.println("\nAttempting to inherit from Final Class 'FourWheeler'...");
        System.out.println("Error: class SubFourWheeler extends FourWheeler {} -> Compile Error: Cannot inherit from final 'FourWheeler'");
        // This is strictly a compile-time check, so we cannot demonstrate with a try-catch block at runtime easily 
        // without compiling a dynamic class, which is overkill. A print statement explains it sufficienty.
    }
}
