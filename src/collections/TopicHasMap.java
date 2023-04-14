package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//Create an HashMap with key and value pair. Perform some operation.
public class TopicHasMap {
    //it stores the value in key and value format.
    //you can add new element with the put method.
    //you can get the element with get method.
    //you can remove the element with remove method.
    public static void main(String[] args) {
        HashMap<Integer,String> employeeDetails = new HashMap<>();
        employeeDetails.put(101,"Joe");
        employeeDetails.put(102,"Alexa");
        employeeDetails.put(103,"Kim");
        employeeDetails.put(109,"Tommy");

        System.out.println(employeeDetails);
        System.out.println(employeeDetails.get(102));
        System.out.println(employeeDetails.get(109));
        employeeDetails.remove(109);
        System.out.println(employeeDetails);

        //if you want to print keys and values separately from HashMap, then use HashSet and ArrayList as below:

        HashSet<Integer> keys =new HashSet<>();
        ArrayList<String> values = new ArrayList<>();

        for(int id : employeeDetails.keySet()){
            keys.add(id);
        }
        for(String name: employeeDetails.values()){
            values.add(name);
        }
        System.out.println(keys);
        System.out.println(values);

    }
}
