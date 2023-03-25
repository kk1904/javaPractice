package singleinheritance;
public class Base {
    public int a;
    public void getBase(int x){
        a=x;
    }
    public void showBase(){
        System.out.println("a=" + a);
    }

    public static void main(String[] args) {
        Base b1=new Base();
        b1.getBase(10);
        b1.showBase();
    }
}
