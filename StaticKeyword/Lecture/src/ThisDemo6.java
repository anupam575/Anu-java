public class ThisDemo6 {
    ThisDemo6 m1()
    {
        return this;
    }

    public static void main(String[] args) {
        ThisDemo6 t=new ThisDemo6();
        t.m1();
    }

}
// this keyword can be ussed to return the current class instance from the method