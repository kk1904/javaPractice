package typesofvariables;

public class StaticVariables {
    static int a=10; //static variables
    static int b=20;
    public  static int sum(){return a+b;}  //static methods
    public static int sub(){return a-b;}
    public static  int mul(){return a*b;}
    public static int div(){return a/b;}

    public static void main(String[] args){
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("Addition is:="+sum());
        System.out.println("Subtraction is:="+sub());
        System.out.println("Multiplication is:="+mul());
        System.out.println("Division is:="+div());
    }
}

