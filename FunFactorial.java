import java.util.*;
public class FunFactorial {
    public static int Factorial(int n){
        int fact =1 ;
        for(int i = 1; i<=n ; i++){

            fact = fact*i;
        }
        return fact;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int fact = Factorial( n );
        System.out.println("Factorial = "+ fact);
    }
    
}
