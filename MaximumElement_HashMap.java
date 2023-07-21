import java.util.*;
public class MaximumElement_HashMap {
    public static void main(String[] args) {
        int ar[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<ar.length ; i++){
            /*if(map.containsKey(ar[i])){
                map.put(ar[i], map.get(ar[i])+1);
            }
            else{
                map.put(ar[i], 1);
            }*/

            map.put(ar[i], map.getOrDefault(ar[i], 0)+1);
        }
        
        for(Integer key: map.keySet()){
            if(map.get(key)>ar.length/3){
                System.out.println(key);
            }
        }
    }
}
