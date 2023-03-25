package operators;

public class IncrementDecrementAndAssignmentOperator {
    public static void main(String[] args){
        System.out.println("Increment/Decrement operator");
        int x=10;

       System.out.println(x++); //Postfix Increment
        System.out.println(++x); //Prefix Increment
        System.out.println(x--); //Postfix Decrement
        System.out.println(--x); //Prefix Decrement

        System.out.println("Assignment operator");
        int y=10;
        y+=2;
        System.out.println(y);
        y-=2;
        System.out.println(y);
        y*=2;
        System.out.println(y);
        y/=2;
        System.out.println(y);
        y%=2;
        System.out.println(y);

    }
}
