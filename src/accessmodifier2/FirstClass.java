package accessmodifier2;

import accessmodifier1.ClassA;
import accessmodifier1.ClassB;

public class FirstClass {
    protected int total;
    protected int calculate(int sub1, int sub2, int sub3){
        total=sub1+sub2+sub3;
        return  total;
    }
    public static void main(String[] args){
        ClassA obj1=new ClassA();  //object created of ClassA from different Package(access_modifier1)
        System.out.println("My name is " + obj1.myName);  //public variable of ClassA from different Package(access_modifier1)
        FirstClass f1=new FirstClass();
        System.out.println("My total marks:"+ f1.calculate(67,89,78));
    }
}
