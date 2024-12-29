public class A2 {
    void m1()
    {
        System.out.println("i am in class A");
    }
}
class B2 extends A2
{
    void m1()
    {
        System.out.println("i am in class B");
    }
    void show()
    {
       super.m1();
       m1();
    }

    public static void main(String[] args) {
        B2 ob=new B2();
        ob.show();
    }

}
//super keyword can be used to invoke immediate parent class method