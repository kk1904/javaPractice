package singleinheritance;
public class Derived extends Base {
    public int b;
    public void getDerived(int y){
        b=y;
    }
    public void showDerived(){
        System.out.println("b=" + b);
    }

    public static void main(String[] args) {
        Derived d1=new Derived();
        d1.getBase(10);
        d1.showBase();

        d1.getDerived(20);
        d1.showDerived();
    }
}
