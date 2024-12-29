public class Tests {
    //void display() non static method
    static void display()

    {
        System.out.println("1");
    }

    public static void main(String[] args) {
      //  Tests t=new Tests();
       // t.display();
       // display();
       Tests.display();
      // show();Cannot call static method outside the class
        Xyz.show();//class name from access


    }
}
class Xyz
{
    static void show()
    {
        System.out.println("2");
    }
}
//Cannot call static method outside the class
// static methods belong to the class not to the object
// a static method can be accessed directly by class name and does not need any object
// a static method can access only static data it cannot access non static data(instance data)
// a static method can call only other static methods and cannot call a non static methods
// a static method cannot refer t this or super keyword in anyway