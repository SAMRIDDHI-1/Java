import java.util.*;
public class ArrayList_Program {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        // Add element
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(1 , 9);
        System.out.println(list1);

        // get element
        int ele = list1.get(2);
        System.out.println(ele);

        //remove element
        list1.remove(4);
        System.out.println(list1);

        //set element
        list1.set(2, 10);
        System.out.println(list1);

        //contains element
        System.out.println(list1.contains(4));

        System.out.println(list1.size());
    }
}