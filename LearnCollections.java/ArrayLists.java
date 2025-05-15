package LearnCollections.java;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Float> list2 = new ArrayList<Float>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //Add elements into arrayList

        list.add(0);
        list.add(1);
        list.add(3);

        System.out.println(list);

        //get Elements from existing list
        int element = list.get(2);
        System.out.println(element);

        //add element in between in between
        list.add(2, 2);
        System.out.println(list);

        //delete element 

        list.remove(3);
        System.out.println(list);

        //for loop ion  a existing arraylist

        for(int i = 1; i < list.size(); i++){
            System.out.print(list.get(i));
        }
    }   
}
