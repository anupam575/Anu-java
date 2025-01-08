class Mahesh {
    int x = 5; // instance ( object) member variable
   private int y; // instance (object) member variable
    void fun1() { // instance (object) member function
        System.out.println("fun1n");
    }
    void fun2() {
        System.out.println("fun2n");
    }

}
public class Object1 {
    public static void main(String[] args) {
        Mahesh m1 = new Mahesh(); // object creation
        Mahesh m2 = new Mahesh(); // object creation

        m1.fun1();// object call
        System.out.println(m1.x);
        System.out.println(m2.x);

    }
}
