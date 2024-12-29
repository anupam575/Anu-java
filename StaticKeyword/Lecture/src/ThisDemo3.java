public class ThisDemo3 {// create constructor
    ThisDemo3() //default constructor
    {
       this(10);
        System.out.println("no args constructor");
    }
    ThisDemo3(int a)// parametrize constructor
    {
        //this();
        System.out.println("parametrize constructor");
    }

    public static void main(String[] args) {
        ThisDemo3 td=new ThisDemo3();
    }
}
// this() keyword can be used to invokecurrent class constructor
