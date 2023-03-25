package javaarray;
public class DynamicArray {
    public static void main(String[] args){
        String[] arrColors={"Red","Green","Blue","Yellow","Purple"};

        int myArrayLength=arrColors.length;
        System.out.println("Length of the Array is:="+myArrayLength);

        for(int i=0; i< arrColors.length; i++){
            System.out.println(arrColors[i]);
        }
    }
}
