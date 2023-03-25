package accessmodifier2;

public class SecondClass {
    private String myCollegeName="PKM";                                      //Private : accessible from this class only
    public  static void main(String[] args){
        SecondClass s2=new SecondClass();                                    //object of this class
        System.out.println("Name of my college is:"+ s2.myCollegeName );
        FirstClass f1=new FirstClass();                                     //object of another class
        System.out.println("Total marks I got:" +f1.calculate(98,92,91));  //instance method of first class
    }
}
