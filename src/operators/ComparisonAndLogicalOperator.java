package operators;

public class ComparisonAndLogicalOperator {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=30;
        if(a>b && a>c){
            System.out.println("a is maximum");
        }
        else if(b>a && b>c) {
            System.out.println("b is maximum");
        }
        else{
            System.out.println("c is maximum");
        }
    }
}