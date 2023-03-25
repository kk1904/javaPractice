package constructor;
public class Employee {
    int employeeId;
    String employeeName;
    int employeeSalary;
    Employee(){       //default constructor
        System.out.println("This is my default constructor");
    } //default constructor
    Employee(int id, String name, int salary){      //parameterized constructor
        employeeId=id;
        employeeName=name;
        employeeSalary=salary;
    }
    public void displayData(){
        System.out.println("Employee Id:="+ employeeId);
        System.out.println("Employee Name:=" +employeeName);
        System.out.println("Employee salary:=" +employeeSalary);
    }
    public static void main(String[] args) {
        Employee employee=new Employee();  //it will call default constructor
        Employee employee1=new Employee(7,"Krishna",25000); //it will call parameterized constructor
        Employee employee2=new Employee(9,"Urvi",90000);
        employee.displayData();
    }
}
