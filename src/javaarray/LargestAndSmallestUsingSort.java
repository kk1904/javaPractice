package javaarray;

import java.util.Arrays;
public class LargestAndSmallestUsingSort {
    public static void main(String[] args){
        int array[] ={12,30,10,2,89,10};
        int size=array.length;
        Arrays.sort(array);  //sort method will sort the array in ascending order  // 2,10,10,12,30,89
        System.out.println("Array after Sorting =" + Arrays.toString(array));
        int smallest=array[0];  //after sorting in ascending order, you will find the smallest number on 0th position of array.
        int largest=array[size-1]; //after sorting in ascending order, the element present at n-1 index is the largest element
        System.out.println("Smallest Element is="+smallest);
        System.out.println("Largest Element is=" +largest);

    }

}
