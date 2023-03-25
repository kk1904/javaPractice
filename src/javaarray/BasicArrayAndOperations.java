package javaarray;
public class BasicArrayAndOperations {
    public static void main(String[] args){
        int[] arr={100,200,300,400,500};
        System.out.println("Length of the Array is:=" +arr.length);
        System.out.println("Elements of the Array are:=");
        for(int i=0; i< arr.length;i++) {
            System.out.println(arr[i]);
        }
        //operations on array element
        arr[0]=350;
        arr[1]=arr[0]+arr[2]; //350+300=350
        arr[2]=arr[0]-arr[2]; //350-300=50
        arr[3]=arr[0]*arr[2]; //350*50=17500
        arr[4]=arr[0]/arr[0]; //350/50=7

        System.out.println("After some operations on array the new values of array are:=");
        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
