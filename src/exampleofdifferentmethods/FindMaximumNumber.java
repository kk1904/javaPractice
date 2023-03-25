package exampleofdifferentmethods;
public class FindMaximumNumber {
    public static void checkMaxNumber(int a,int b,int c){
        if(a!=b && a!=c && b!=c){
            if(a>b && a>c)
                System.out.println(a + " is bigger number");
            else if(b>a && b>c)
                System.out.println(b + " is bigger number");
            else
                System.out.println(c + " is bigger number");}
        else{
            System.out.println("Numbers are same");
        }
    }
    public static void main(String[] args){
        checkMaxNumber(10,20,30);
        checkMaxNumber(10,10,20);
    }
}
