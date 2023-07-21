public class PowerXRecursion {
    public static int Power(int x , int n){
        if(n==0){
            return 1;
        }
       // return x*Power(x , n-1);
       int x_1 = Power(x ,n-1);
       int xn= x *x_1;
       return xn;
    }
    public static int OptimisedPower(int a , int n){
        if(n==0){
            return 1;
        }
        int halfpower= OptimisedPower(a, n/2);
        int halfpowersq = halfpower* halfpower;
        if(n%2!=0){
            halfpowersq= a *halfpowersq;
        }   
        return halfpowersq;
    }
    public static void main(String[] args) {
        System.out.println(OptimisedPower(2,10));
    }
    
}
