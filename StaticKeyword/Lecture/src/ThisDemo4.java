public class ThisDemo4 {
    void m1 (ThisDemo4 td) // class this demo4 ka reference create  (argument)
    {
        System.out.println("im in m1 method");
    }
    void m2()
    {
        m1(this);

    }

    public static void main(String[] args) {
        ThisDemo4 td=new ThisDemo4();
        td.m2();
    }
}
// this keyword can be used to pass as an argument in the methood call