package collections;

import java.util.HashSet;
//Create an Hashset and store and remove some Integers. Find it’s length.
public class TopicHasSet {
    //diff. between arraylist and hasset
    //it will display elements in unordered manner
    //no duplicates will be allowed.
    public static void main(String[] args) {
        HashSet<Integer> number=new HashSet<>();
        number.add(7);
        number.add(9);
        number.add(19);
        number.add(null);
        number.add(19);
        System.out.println(number);
        System.out.println("Current Length of the HasSet is:=");
        System.out.println(number.size());
        number.remove(19);
        number.remove(9);
        System.out.println(number);
        number.add(1);
        number.add(3);
        number.add(5);
        System.out.println(number);
        System.out.println("After Some Operations Length of the HasSet is:=");
        System.out.println(number.size());
    }
}
