package methodoverriding;
public class Employee {
    public static int base=10000;
    public int salary(){
        return base;
    }
    public static void main(String[] args) {
        Employee employee=new Employee();
        System.out.println("General basic Salary of Employee is="+ employee.salary());
    }

}
