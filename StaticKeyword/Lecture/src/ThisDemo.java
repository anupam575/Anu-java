public class ThisDemo {
    int i;
    void setValue(int i)
    {
        this.i=i;
        //i=i;
    }
    void show()
    {
        System.out.println(i);
    }

    public static void main(String[] args) {
        ThisDemo td=new ThisDemo();
        td.setValue(100);
        td.show();
    }
}
// this keyword is used to invoke current class instance variable
