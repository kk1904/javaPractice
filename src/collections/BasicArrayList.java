package collections;

import java.util.ArrayList;

public class BasicArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Krishna");
        arrayList.add("Urvi");
        arrayList.add("Milan");

        arrayList.remove(0);
        System.out.println(arrayList);

        for (String name : arrayList){
            System.out.println(name);
        }
    }
}
