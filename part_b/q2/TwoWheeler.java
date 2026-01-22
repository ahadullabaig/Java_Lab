class TwoWheeler extends Vehicle
{
    String Brand;
    double Cost;
    String EngineType;
    String Color;

    TwoWheeler(int yearOfManufacture, boolean hasHelmet, String brand, double cost, String engineType, String color)
    {
        super(yearOfManufacture, hasHelmet);
        this.Brand = brand;
        this.Cost = cost;
        this.EngineType = engineType;
        this.Color = color;
    }

    @Override
    void getData()
    {
        System.out.println("TwoWheeler: Getting Data...");
    }

    @Override
    void putData()
    {
        System.out.println("TwoWheeler: Year of Manufacture: " + yearOfManufacture);
        System.out.println("TwoWheeler: Has Helmet: " + hasHelmet);
        System.out.println("TwoWheeler: Brand: " + Brand);
        System.out.println("TwoWheeler: Cost: " + Cost);
        System.out.println("TwoWheeler: Engine Type: " + EngineType);
        System.out.println("TwoWheeler: Color: " + Color);
    }
}
