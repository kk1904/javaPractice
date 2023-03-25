public class MethodOverloading {              //same name, diff number of arguments & diff types of arguments
    public static void sum(int a, int b){
        System.out.println("int's sum is="+(a+b));
    }
    public static void sum(float a, float b, float c){
        System.out.println("float's sum is="+(a+b+c));
    }
    public static void sum(double a,double b){
        System.out.println("double's sum is="+(a+b));
    }

    public static void main(String[] args) {
        sum(10,20);
        sum(10.78f,20.1f,40.99f);
        sum(33.78d,678.98d);
    }
}
