interface Shape
{
    double area();
}

class Rectangle implements Shape
{
    double l, b;

    Rectangle(double l, double b)
    {
        this.l = l;
        this.b = b;
    }

    public double area()
    {
        return l*b;
    }
}

class Triangle implements Shape
{
    double b, h;

    Triangle(double b, double h)
    {
        this.b = b;
        this.h = h;
    }

    public double area()
    {
        return 0.5*b*h;
    }
}

public class DemoArea
{
    public static void main(String[]args)
    {
        Rectangle r = new Rectangle(5.5, 10);
        System.out.println("Area: " + r.area());

        Triangle t = new Triangle(5, 9.9);
        System.out.println("Area: " + t.area());
    }
}

