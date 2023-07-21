public class IncreasingRecursion {
    public static void IncreasingRecursion( int n){
    if(n==1){
        System.out.println(1);
        return;
    }
    IncreasingRecursion(n-1);
    System.out.println( n);
}
     public static void main(String[] args) {
        IncreasingRecursion(10);
    }

}
