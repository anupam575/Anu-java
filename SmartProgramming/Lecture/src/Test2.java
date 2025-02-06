import java.io.FileInputStream;

public class Test2 {
    public static void main(String[] args) {
      //  FileInputStream fis=new FileInputStream("d:/abc.txt");
      //  Class.forName("com.mysql.jdbc.Driver");
        //checked exception compiletime exception
       // int a=100, b=0, c;
      //  c=a/b;
//System.out.println(c);
        //String name=null;
       // System.out.println(name.length());
      //  try{
           // FileInputStream fis=new FileInputStream("d:/abc.txt");
      //        Class.forName("com.mysql.jdbc.Driver");

     //   }
      //  catch(Exception e)
      //  {
      //      System.out.println(e);
      //  }
       // try {
           // int a = 100, b = 0, c;
           // c = a / b;
         //   System.out.println(c);
       // } catch (ArithmeticException e) {
        //    System.out.println(e);
      //  }
    //    System.out.println("hello");

        System.out.println("1");
        try{
            System.out.println("2");
            int a=100, b=0, c;
            System.out.println("3");
            c=a/b;// exception-> catch skip 3 line code 4 c 5 do not print
            System.out.println("4");
            System.out.println(c);
            System.out.println("5");
        }
        catch(ArithmeticException e)
        {
            System.out.println("6");
            System.out.println("e");
            System.out.println("7");
        }
        System.out.println("hello");
   }

}
