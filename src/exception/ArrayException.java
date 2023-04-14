package exception;
//Write a program to show the Aaary Exception.

public class ArrayException {
    public static void main(String[] args) {
        int[] arr={100,200,300,400,500};
        try{
            System.out.println(arr[6]);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
