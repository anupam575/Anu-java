public class ThisDemo2 {
    void display()
    {
        System.out.println("hello");
    }
    void show() //call display method
    {
        display();// call display method
      //  this.display();
    }

    public static void main(String[] args) {
        ThisDemo2 td=new ThisDemo2();
        td.show(); //call show method
    }
}
// this keyword can be used to invoke current class method
// if you dont use the this keyword compiler automatically adds this keyword while invoking the method