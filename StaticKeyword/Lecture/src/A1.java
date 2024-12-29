public class A1 {
    int i=40;
}
class B1 extends A1
{
    int i =20;
    void show(int i)// local variable
    {
        //System.out.println(i);
        System.out.println(super.i);// this,i
        System.out.println(this.i);
    }

    public static void main(String[] args) {
        B1 ob=new B1();
        ob.show(30);
    }
}
// super keyword refers to the immediate parent class instance variable