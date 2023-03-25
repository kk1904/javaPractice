package abstraction;
public class SBI extends Bank{
    @Override
    int getRateOfInterest() {                  //implementation of abstract method
        return 7;
    }
    public static void main(String[] args) {
        SBI sbi = new SBI();
        System.out.println("Interest Rate of SBI is:=" + sbi.getRateOfInterest());
    }
}
