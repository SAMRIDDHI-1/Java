public class FibonnaciRecursion {
    public static int Fibonacci(int n){
        if(n==0 || n==1)
        return n;
        
        
        int f1 = Fibonacci(n-1);
        int f2 = Fibonacci(n-2);
        int f = f1+f2;
        return f;
        
    }
    public static void main(String args[]){
        System.out.println(Fibonacci(7));

    }
    
}
