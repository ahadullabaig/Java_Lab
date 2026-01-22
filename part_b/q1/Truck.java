public class Truck extends Car
{
    int weight;

    public Truck(int speed, double regularPrice, String color, int weight)
    {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    double getSalePrice()
    {
        if (weight > 2000)
        {
            return super.getSalePrice() * 0.90; // 10% discount
        }
        else
        {
            return super.getSalePrice() * 0.80; // 20% discount
        }
    }
}
