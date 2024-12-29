public class A {
    int i=10;
}
class B extends A
{
    int i=20;
    void show(int i) //pass parameter
    {
        System.out.println(super.i);//super
    }

    public static void main(String[] args) {
        B ob=new B();
        ob.show(30); // pass argument
    }
}
// super keyword is a reference variable which is used to refer immediate parent class object