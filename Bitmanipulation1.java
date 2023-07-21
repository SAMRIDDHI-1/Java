import java.util.*;
public class Bitmanipulation1 {
    public static int UpdateithBit(int n , int i , int newBit){
        int bitmask = 1<<i;
        if(newBit==0){
            return n&bitmask;
        }
        else{
            return n|bitmask;
        }
    }
    public static int Clearlastbit(int n , int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }
    public static int ClearRange(int n , int i , int j){
        int a = ((~0)<<(j+1));
        int b =(1<<i)-1;
        int bitmask = a|b;
        return n&bitmask;
    }
    //public static int Powerof2(int n){
       // return n&(n-1)==0;
    //}
    public static void Countsetbit(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        System.out.println("the count of setbit "+count);
    }
    public static int fastexponentiation(int a , int n){
        int ans =1;
        while(n>0){
            if((n&1)!=0){
                ans = ans*a;
            }
            a=a*a;
            n= n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("enter i");
        int i = sc.nextInt();
        System.out.println("enter j");
        int j = sc.nextInt();
       /*/ System.out.println(UpdateithBit(n, i, j));
        System.out.println(Clearlastbit(n, i));
        System.out.println(ClearRange(n, i, j));*/
        Countsetbit(n);
        System.out.println(fastexponentiation(n,j));
    }
}
