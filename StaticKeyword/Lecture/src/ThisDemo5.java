class Test2
{
    Test2(ThisDemo5 td) // class this demo 5 ka parameter pass
    {
        System.out.println("test class constructor");
    }
}


public class ThisDemo5{
    void m1()
    {
        Test2 t=new Test2(this); // class test2 ka object creation
    }

    public static void main(String[] args) {
        ThisDemo5 t=new ThisDemo5(); // class this demo5 object creation
        t.m1();
    }
}
//this keyword can be used to pass as an argument in the constructor call