package javaarray;
public class FindSmallestAndLargestInArray {
    public static void main(String[] args){
        int numbers[] ={12,30,10,2,89,10};

        int smallest=numbers[0]; //12 First it will assign the[0] position number from array into the smallest variable(12)
        int largest =numbers[0]; //12 //30 First it will assign the[0] position number from array into the smallest variable(12)

            for(int i=0; i<numbers.length;i++){
            if(numbers[i]<smallest){   //it will compare all the elements from array one by one
                smallest=numbers[i];    //if it will find the smallest element from array which is less than the value stored in
            }                           //smallest variable, then it will change it with new value.
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        System.out.println("Smallest Element in array=" +smallest);
        System.out.println("Largest Element in array=" +largest);
    }
}
