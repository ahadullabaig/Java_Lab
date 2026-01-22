class MyTwoWheeler extends TwoWheeler
{
    String OwnerName;

    MyTwoWheeler(int yearOfManufacture, boolean hasHelmet, String brand, double cost, String engineType, String color, String ownerName)
    {
        super(yearOfManufacture, hasHelmet, brand, cost, engineType, color);
        this.OwnerName = ownerName;
    }

    @Override
    void putData()
    {
        super.putData();
        System.out.println("MyTwoWheeler: Owner Name: " + OwnerName);
    }
}
