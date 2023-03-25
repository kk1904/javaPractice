package javaarray;
public class OddEvenUsingForeach {
    public static void evenNumbers(int[] arrnumbers) {
        System.out.println("Even Numbers are:");
        for (int number : arrnumbers) {
            if (number % 2 == 0)
                System.out.println(number);
        }
    }
    public static void oddNumbers(int[] arrnumbers) {
        System.out.println("Odd Numbers are:");
        for (int number : arrnumbers) {
            if (number % 2 != 0)
                System.out.println(number);
        }
    }
    public static void main(String[] args){
        int[] arrnumbers={1,2,3,4,5,6,7,8,9,10};
        evenNumbers(arrnumbers);
        oddNumbers(arrnumbers);

    }
}

