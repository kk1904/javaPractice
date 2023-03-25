package hierachicalinheritance;
public class Sum extends Number {
    public static void addition(){
        System.out.println("Addition is=:"+ (no1+no2));
    }

    public static void main(String[] args){
        getData(50,60);
        display();
        addition();
    }
}
