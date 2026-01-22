public class MyOwnAutoShop
{
    public static void main(String[] args)
    {
        Sedan mySedan = new Sedan(160, 20000, "Red", 10); // length 10 -> 10% discount
        System.out.println("Sedan Sale Price: " + mySedan.getSalePrice());

        Ford myFord = new Ford(180, 40000, "Black", 2022, 1500); // 40000 - 1500 = 38500
        System.out.println("Ford Sale Price: " + myFord.getSalePrice());

        Car myCar = new Car(140, 15000, "White");
        System.out.println("Car Sale Price: " + myCar.getSalePrice());
    }
}
