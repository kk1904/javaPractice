package multilevelinheritance;
public class Student {
    public int rollNo;
    public void getRollNo(int x){
        rollNo=x;
    }
    public void displayRollNo(){
        System.out.println("Roll Number of the student is " + rollNo);
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.getRollNo(7);
        s1.displayRollNo();
    }
}


