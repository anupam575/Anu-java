package In.kgcoding;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("prahsnat", 30, 3400);
        System.out.println( emp.getEmployeeDetails());
        emp.setName("golu");
        System.out.println(emp.getEmployeeDetails());
    }
}
