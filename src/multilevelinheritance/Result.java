package multilevelinheritance;
public class Result extends Subject {
    public float total,percentage;
    public void displayResult(){
        total=sub1+sub2;
        percentage=total/2;
        System.out.println("Total marks of Student:="+total);
        System.out.println("Percentage of the student:="+percentage);
    }

    public static void main(String[] args) {
        Result r1=new Result();
        r1.getRollNo(7);
        r1.displayRollNo();
        r1.getMarks(85,75);
        r1.displayMarks();
        r1.displayResult();
    }
}
