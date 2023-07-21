import java.util.*;
public class IndianCOinsGREEDYalgo {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins , Comparator.reverseOrder());

        int count =0 ;
        int amt = 590;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0 ; i<coins.length; i++){
            if(coins[i] <= amt){

                while(coins[i]<= amt){
                    count ++;
                    ans.add(coins[i]);
                    amt -= coins[i];
                }
            }
        }
        System.out.println("total min cost = " + count);

        for(int i =0 ; i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();

    }
}
