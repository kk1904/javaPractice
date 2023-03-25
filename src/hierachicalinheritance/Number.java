package hierachicalinheritance;
public class Number {
    public static int no1,no2;
    public static void getData(int a,int b){
        no1=a;
        no2=b;
    }
    public static void display(){
        System.out.println("Number1=:" +no1);
        System.out.println("Number2:=" +no2);
    }
    public static void main(String[] args){
       getData(50,60);
       display();
    }
}
