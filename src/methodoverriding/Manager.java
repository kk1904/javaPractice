package methodoverriding;
public class Manager extends Employee {
    public int salary(){        // This method overrides salary() of Parent(Employee)
        return base+20000;
    }
    public static void main(String[] args) {
        Manager manager=new Manager();
        System.out.println("Salary of the Manager is="+manager.salary());
    }

}
