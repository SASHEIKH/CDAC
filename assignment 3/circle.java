public class circle {
    double radius;
    public circle()
    {
        this(15);
        Areacircle();
        circum();
    radius=10;
    }
    public circle(double r)
    {
        this.radius=r;
    }
    void Areacircle()
    {
        System.out.println("radius of circle+"+radius);
        double area = Math.PI*radius*radius;
        System.out.println("Area of circle: " + area);
    }
    void circum()
    {
        double circum = 2*Math.PI*radius;
        System.out.println("circumference of circle: " + circum);
    }
}
class circlemain
{
    public static void main(String args[])
    {
        circle obj = new circle();
        obj.Areacircle();
        obj.circum();
        circle obj1 = new circle(70);
        obj1.Areacircle();
        obj1.circum();

    }
}