public class Testi {
    int i; // instantiate variable
   // void setValue(int x)
    void setValue(int i)// local variable

    {
       // i=x;
       // i=i;
        this.i=i; // this.i refer to local variable and instantiate variable
        // this refer to  the current class instantiate variable
        //instantiate and local variable same name is used this keyword
        // if this keyword is not used print default value
        // this keyword represents the current instance of a class
        //it is used to call the default constructor of the same clas
        // it is used to access methods of the current class

    }
    void show()
    {
        System.out.println(i); // default value
    }
}
class Zxy
{
    public static void main(String[] args) {
        Testi t=new Testi();
        t.setValue(10);
        t.show();
    }
}