package accessmodifier1;

public class ClassB {

    public static void main(String[] args) {
        System.out.println("Addition is:=" + ClassA.sum(100, 200)); //both methods and variables are derived from ClassA
        System.out.println("Subtraction is:=" + ClassA.sub(400, 100)); //declared protected in classA
    }
}