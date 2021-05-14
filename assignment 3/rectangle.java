class rectangle
{
    int length, breadth;
    public rectangle()
    {
        this(50,60);
                Area();
        length = 10;
        breadth = 20;
    }
    public rectangle(int l, int b)
    {
        this.length = l;
        this.breadth = b;
    }
    void Area()
    {
        int area = (length * breadth);
        System.out.println("area of length="+length+",breadth="+breadth+" is -> "+area);

    }
}
class RectangleArea
{
    public static void main(String args[])
    {
        rectangle obj = new rectangle();
        System.out.println("default constructor");
        obj.Area();
        rectangle obj1 = new rectangle(40,60);
        System.out.println("parameterized constructor");
        obj1.Area();

    }
}