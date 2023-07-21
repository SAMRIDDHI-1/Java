import java.util.*;
public class FunMultiply {
    public static int Multiply(int a , int b){
        int p = a*b;
        return p;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two no ");
        int a = sc.nextInt();
        int b = sc.nextInt();
       int p = Multiply( a, b);
        System.out.println("Value of a*b = "+p);
    }
    
}
