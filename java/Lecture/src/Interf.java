interface i1
{
    int x=6;
    void f1();

    static void f2()
    {
        System.out.println(x);
    }// interface does not make a bodu or function
}
interface i2 extends i1
{
    int y=2;
    static void f2()
    {
        System.out.println(x);
    }
    void f3();
}
class c1 implements i2
{


    @Override
    public void f3() {

    }

    @Override
    public void f1() {

    }
}


public class Interf {
    public static void main(String[] args) {
        i1.f2();
        c1 c1=new c1();
        System.out.println(c1.y);//x
        i2.f2();

    }
}
