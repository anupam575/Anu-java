public class Employee {
    int empid; // this is a instantiate mwthod for
    //The instantiate  method is used to create an object
    String name;
    //String company;
    static String company="Smart Programming";

    //Employee(int empid, String name, String company)// parametrize constructor
    Employee(int empid, String name)// parametrize constructor

    {
        this.empid=empid;
        this.name=name;
        //this.company=company;
    }

    void display() // mehod creation
    {
        System.out.println(empid+" "+name+" "+company);
    }

    public static void main(String[] args) {
       // Employee e1=new Employee(101, "amit", "Smart programming"); // object creation
        Employee e1=new Employee(101, "amit"); // object creation

        e1.display(); //method call
       // Employee e2=new Employee(101, "amit", "Smart programming"); // object creation

        Employee e2=new Employee(101, "amit"); // object creation

        e2.display(); // method call
    }

}
// instantiate variable only object
