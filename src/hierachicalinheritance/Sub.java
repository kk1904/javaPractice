package hierachicalinheritance;

public class Sub extends Number {
    public static void subtraction(){
        System.out.println("Subtraction is:="+ (no1-no2));
    }

    public static void main(String[] args) {
        getData(60,50);
        display();
        subtraction();
    }
}
