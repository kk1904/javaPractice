public class Exam {
    public static void factorial(int number){
        int fact=1;
        System.out.println("Factorial of " + number + " is=");
        for(int i=1; i<=number; i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] ags){
        factorial(4);
        factorial(5);
    }
}
