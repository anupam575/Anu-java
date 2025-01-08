public class Demo {
    int x,y;
    Demo() // default construc
    {
       // System.out.println("Constructor 1 executed");
       x=5;
        y=6;

    }
    void f1()
    {
      //  System.out.println("Function 1 executed");
        x=22;
        y=23;
    }
}
class Construct
{
    public static void main(String[] args) {
        Demo d1=new Demo();
       // Demo d2=new Demo();
      //  Demo d3=new Demo();
        //d1.f1();
       // System.out.println(d1.x);
       // System.out.println(d1.y);


    }
}
