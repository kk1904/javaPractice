package abstraction;
public class PNB extends Bank {
    @Override
    int getRateOfInterest() {                  //implementation of abstract method
        return 8;
    }
    public static void main(String[] args) {
        PNB pnb=new PNB();
        System.out.println("Interest Rate of PNB is:=" + pnb.getRateOfInterest());
    }
}
