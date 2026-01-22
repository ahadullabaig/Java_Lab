final class FourWheeler extends Vehicle
{
    
    FourWheeler(int yearOfManufacture)
    {
        super(yearOfManufacture);
    }

    @Override
    void getData()
    {
        System.out.println("FourWheeler: Getting Data...");
    }

    @Override
    void putData()
    {
        System.out.println("FourWheeler: Year of Manufacture: " + yearOfManufacture);
        System.out.println("FourWheeler: Has Helmet: " + hasHelmet);
    }
}
