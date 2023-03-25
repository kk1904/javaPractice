package methodoverriding;
public class Clerk extends Employee {
    public int salary(){      // This method overrides salary() of Parent(Employee)
        return base+10000;
    }

    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        System.out.println("Salary of the Clerk is:="+clerk.salary());
    }
}
