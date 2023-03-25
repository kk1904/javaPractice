package multilevelinheritance;
public class Subject extends Student{
    public int sub1,sub2;
    public void getMarks(int x,int y){
        sub1=x;
        sub2=y;
    }
    public void displayMarks(){
        System.out.println("First Subject Marks:="+sub1);
        System.out.println("Second Subject Marks:="+sub2);
    }
    public static void main(String[] args){
        Subject s2 =new Subject();
       s2.getMarks(85,75);
       s2.displayMarks();
    }
}
