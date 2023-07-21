public class Function_prime {
    public static boolean isPrime(int n){
        boolean isPrime = true ;
        for(int i =2 ; i<=n-1 ; i++ ){
            if(n%i==0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void PrimeRange(int n){
        for (int i =2 ; i<=n;i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
   /*  public static void main (String args[]){
        System.out.println(isPrime(12));
    }*/
    public static void main(String args[]){
        PrimeRange(50);
    }

    
}
