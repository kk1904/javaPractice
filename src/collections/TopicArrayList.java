package collections;

import java.util.ArrayList;
import java.util.Collections;
//Create an ArrayList of 5 numbers and find the largest and smallest number
public class TopicArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(19);
        arrayList1.add(7);
        arrayList1.add(9);
        arrayList1.add(91);
        arrayList1.add(1);

        for (Integer number : arrayList1){
            System.out.println(number);
        }
        Collections.sort(arrayList1);
        System.out.println("ArrayList after Sorting:="+ arrayList1);
        System.out.println("Smallest Element is:="+ arrayList1.get(0));
        System.out.println("Largest Element is:="+ arrayList1.get(arrayList1.size()-1));
    }
}
