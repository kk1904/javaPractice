package controlstructure;

public class EvenNumbersUsingForLoop {
    public static void main(String[] args){
        //Even numbers from 1 to 100
        int number=100;
        for(int i=0; i<=number; i++){
            if(i%2==0)
                System.out.println(i + " Number is Even");
        }
    }
}
