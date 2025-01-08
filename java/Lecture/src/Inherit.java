class Nokia1
{
    int x,y;
    Nokia1(int p, int q)
    {
        x=p; y=q;
        System.out.println("Parent's constructor executed");
    }
    void f1()
    {
        System.out.println("Parent function 1 executed");

    }
    void f2()
    {
        System.out.println("Parent function 2 executed");

    }

}
class Nokia2 extends Nokia1
{
    int z;
    void f3()
    {
        System.out.println("child function 1 executed");
    }
    Nokia2()
    {
        super(12,15);// automatically
        System.out.println("child's constructor executed");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Nokia2 n1=new Nokia2();
       // n1.f1();
       // n1.f2();
       // n1.f3();

    }
}
