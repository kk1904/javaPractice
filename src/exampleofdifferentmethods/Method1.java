package exampleofdifferentmethods;
public class Method1 {
    protected int id=1;
    protected float percentage=66.67f;
    protected void result(){      //instance method with no argument no return type
        if(percentage>=70){
            System.out.println("Distinction");
        }
        else if(percentage>=60 && percentage<69){
            System.out.println("First Class");
        }
        else if(percentage>=50 && percentage<59){
            System.out.println("Second Class");
        }
        else if(percentage>=40){
            System.out.println("pass Class");
        }
        else {
            System.out.println("fail");
        }
    }
    public  static void main(String[] args)
    {
        Method1 m1=new Method1();
        System.out.println("ID of student"+ m1.id);
        System.out.println("Percentage of Student" + m1.percentage);
        m1.result();
    }

}
