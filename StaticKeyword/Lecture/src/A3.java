public class A3 {
    A3()
    {
        System.out.println("i am in class A");
    }
}
class B3 extends A3{
    B3()
    {
        super();
        System.out.println("i am in class B");
    }

    public static void main(String[] args) {
        B3 ob=new B3();
    }
}
