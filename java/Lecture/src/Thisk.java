class Example2 {
    private int x,y;
    void f1 (int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    void display()
    {
       // int x=65,y=87;
        System.out.println(x);
        System.out.println(y);
    }
}

public class Thisk {
    public static void main(String[] args) {
        Example2 e1=new Example2();
        e1.f1(55,56);
        e1.display();

    }
}
