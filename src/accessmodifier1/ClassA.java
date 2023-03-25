package accessmodifier1;

public class ClassA {
    public String myName="krishna"; //public: accessible from everywhere
    protected static int sum(int a,int b){     //protected: accessible into package and subclasses
        return a+b;
    }
    protected static int sub(int a, int b){
        return a-b;
    }
    public static void main(String[] args){
        System.out.println("Addition is:"+sum(100,200));
        System.out.println("Subtraction is:"+sub(200,100));
    }
}
