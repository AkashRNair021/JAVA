public class Rectangle
{
    double length,breadth;
    void getData(double l,double b)
    {
        length = l;
        breadth = b;

    }
    double calArea()
    {
        return length*breadth;
    }
    public static void main(String args[])
    {
        Rectangle r= new Rectangle();
        r.getData(12.5,38.1);
        System.out.println("Area="+r.calArea());
    }
}