
class Employee
{
    private int empid;//data hide

    public int getEmpid() {//encapsulation
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }
}

 class Company {
     public static void main(String[] args) {
         Employee e=new Employee();

         e.setEmpid(108);
         System.out.println(e.getEmpid());
     }
}
