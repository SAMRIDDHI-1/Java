import java.util.*;
public class BinomialCoeff {
    public static int Factorial(int n){
        int fact =1 ;
        for(int i = 1; i<=n ; i++){

            fact = fact*i;
        }
        return fact;
    }
     
    public static int Binomial(int n, int r)
{
    int a = Factorial(n);
    int b = Factorial(r);
    int c = Factorial(n-r);   
    return a/(b*c);

}
public static void main (String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Value of n");
    int n = sc.nextInt();
    System.out.println("Enter Value of r");
    int r = sc.nextInt();
    double d = Binomial(n,r);
    System.out.println("Binomial Coefficient = " + d);


}
}