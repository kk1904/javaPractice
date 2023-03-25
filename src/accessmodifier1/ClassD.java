package accessmodifier1;

public class ClassD {
    public static void main(String[] args){
        System.out.println("Multiplication is:=" + ClassC.multiplication(40,50)); //both variables and method
                                                                                        // are retrieved from classC
        System.out.println("Division is: "+ ClassC.division(20.5F,6)); //declared protected in ClassC

    }
}
