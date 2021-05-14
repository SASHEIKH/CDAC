public class circle {
    double radius;
    public void setradius(double r)
    {
    radius=r;
    }
    double Area()
    {
        double area = Math.PI*radius*radius;
        return (area);
    }
    double circum()
    {
        double circum = 2*Math.PI*radius;
        return (circum);
    }
}
class circlemain
{
    public static void main(String args[])
    {
        circle obj = new circle();
        obj.setradius(10);
        System.out.println("Area of circle: " + obj.Area());
        System.out.println("circumference of circle: " + obj.circum());
    }
}