package javaarray;
public class ArrayUsingForeachLoop {
    public static void main(String[] args){
        String[] nextCategories={"Women","Men","Boys","Girls","Home","Furniture","Beauty","Brands","Flowers"};

        //print all categories using Forloop
        for(int i=0; i<nextCategories.length;i++){
            System.out.println(nextCategories[i]);
        }
        //print all categories using Foreachloop
        for(String nextCategory : nextCategories){
            System.out.println(nextCategory);
        }
    }

}
