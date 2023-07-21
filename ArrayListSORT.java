import java.util.*;
public class ArrayListSORT {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        Collections.sort(list); //ascending
        System.out.println(list);
        //decending
        Collections.sort(list , Collections.reverseOrder(null));
        System.out.println(list);
    }
}
