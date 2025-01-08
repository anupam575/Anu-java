class Nokia
{
    private int mic;
    private int cam;
    void setValue ()//function
    {
        mic=2;
        cam=40;

    }
    void display()
    {
        System.out.println(mic);
        System.out.println(cam);
    }
}
public class classesAndObject {
    public static void main(String[] args) {
        Nokia n1 = new Nokia();
        n1.setValue();
        n1.display();


    }
}
