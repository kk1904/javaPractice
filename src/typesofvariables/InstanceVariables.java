package typesofvariables;

public class InstanceVariables {
    int id=1;   //instance variable
    String name="Krishna";
    int sub1 = 76;
    int sub2 = 89;
    int sub3 = 87;
   public void getData() {
       int total = sub1+sub2+sub3;
       int percentage = (total/3);
       System.out.println("Total Marks:="+total);
       System.out.println("Percentage:="+percentage);
   }
   public static void main(String[] args){
       InstanceVariables iv=new InstanceVariables();  //object of the class
       System.out.println("Id of Student:="+(iv.id));
       System.out.println("Name of Student:="+(iv.name));
       iv.getData();
   }
}
