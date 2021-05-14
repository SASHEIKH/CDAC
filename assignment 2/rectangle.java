class rectangle
{
    int length, breadth;
    public void setValue(int l, int b)
    {
        length = l;
        breadth = b;
    }
    int Area()
    {
        return (length * breadth);
    }
}
class RectangleArea
{
    public static void main(String args[])
    {
        rectangle obj = new rectangle();
        obj.setValue(10, 5);
        System.out.println("Area of rectangle: " + obj.Area());
    }
}