
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
     //   student1.setAge(12);student1.setName("Ram");student1.setId(123);
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
      //  System.out.println(Student.count);
        Student.getcount();
       
     int c =   sum(1,2);
        System.out.println(c);
      // Test test = new Test();
      // test.sum(1, 2);

    }
   // public  int sum(int a, int b){

        public static int sum(int a, int b){
        return a + b;


    }
}
// the static method cannot use non static data member or call non-statiic method directly
// this and super cannot be used in static context