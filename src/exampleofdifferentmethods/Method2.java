package exampleofdifferentmethods;
public class Method2 {
        public  static int sum(int a,int b){       //static methods with arguments with return value
            return a+b;}
        public static int sub(int a,int b){
            return a-b;}
        public static  int mul(int a,int b){
            return a*b;}
        public static int div(int a,int b){
            return a/b;}

        public static void main(String[] args){

            System.out.println("Addition is:="+sum(10,20));
            System.out.println("Subtraction is:="+sub(20,10));
            System.out.println("Multiplication is:="+mul(30,40));
            System.out.println("Division is:="+div(50,20));
        }
}


