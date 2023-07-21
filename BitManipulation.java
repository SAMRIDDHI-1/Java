import java.util.*;
public class BitManipulation {
    public static void And(int a , int b){
        System.out.println(a&b);
    }
    public static void OR(int a , int b){
        System.out.println(a|b);
    }
    public static void XOR(int a , int b){
        System.out.println(a^b);
    }
    public static void OneComplement(int a ){
        System.out.println(~a);
    }
    public static void LeftShift(int a , int b){
        System.out.println(a<<b);
    }
    public static void RightShift(int a , int b){
        System.out.println(a>>b);
    }
    public static void CheckEvenOdd(int n){
    int bitmask=1;
    if((n&bitmask)==0){
        System.out.println("even");
    }
    else{
        System.out.println("Odd");
    }
}   
    public static int GetithBit(int n , int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int SetithBit(int n , int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static int ClearithBit(int n , int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter a");
    int a = sc.nextInt();
    System.out.println("enter b");
    int b = sc.nextInt();
    /*And(a,b);
    OR(a,b);
    XOR(a,b);
    OneComplement(a);
    LeftShift(a, b);
    RightShift(a, b);
    CheckEvenOdd(b);*/
    System.out.println(GetithBit(a, b));
    System.out.println(SetithBit(a, b));
    System.out.println(ClearithBit(a, b));
    }
    
}
