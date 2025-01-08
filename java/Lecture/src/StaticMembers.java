class A {
    int x; // instance
    private static int y;
    void fun1 ()
    {
        y=22;
        x=5;
    }

    void fun2 ()
    {
        System.out.println(y);
    }
    void fun3() {
        y=45;
    }
    void fun4() {
        y=98;
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        a1.fun1();
        a2.fun4();
        a1.fun2();
      //  a1.fun4();

    }
}
