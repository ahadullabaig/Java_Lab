abstract class Vehicle
{
    boolean hasHelmet;
    int yearOfManufacture;

    Vehicle(int yearOfManufacture)
    {
        this.yearOfManufacture = yearOfManufacture;
        this.hasHelmet = false; // Default for 4-wheeler
    }

    Vehicle(int yearOfManufacture, boolean hasHelmet)
    {
        this.yearOfManufacture = yearOfManufacture;
        this.hasHelmet = hasHelmet;
    }

    abstract void getData();
    abstract void putData();
}
