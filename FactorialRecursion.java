public class FactorialRecursion {
    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=Factorial(n-1);
        int f = n*Factorial(n-1);
        return f;
    }
    public static void main(String args[]){
        System.out.println(Factorial(5));
    }
}
