public class Teste
{
    static int a=10;// stativ variable belong to the class not an object
    // (static variable class directly through access)
    // static variable are used for memory management , memory efficent memory save
    //the static variable gets memory only once in the class area  at the time of clas loading
     //static method belong to class not object
    //static methods can be called directly by class nameas follows:
    //Classname.methodname();
    //static method does not use create object

    //int a=10;
}
class Demo
{
    public static void main(String[] args) {
        System.out.println(Teste.a);

    }
}
