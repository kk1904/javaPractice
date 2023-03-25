package accessmodifier1;

public class ClassC {
    protected  static int multiplication(int c,int d){
        return c*d;
    }
    protected static float division(float c,float d){
        return c/d;
    }
    public static void main(String[] args){
        System.out.println("Multiplication is:=" + multiplication(10,20));
        System.out.println("Division is:=" + division(10,20));
    }
}
