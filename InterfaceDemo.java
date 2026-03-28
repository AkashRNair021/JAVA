interface Vehicle
{
    String Name="i10";
    void msg();
}
class Car implements Vehicle
{
    int cho=6789;
    public void msg()
    {
        System.out.println(" Vehicle name:"+ Name);
        System.out.println(" Vehicle no:"+ cho);
        
    }
}
class InterfaceDemo {
    public static void main(String args[])
    {
        Car ob=new Car();
        ob.msg();
    }
}