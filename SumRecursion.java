public class SumRecursion {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int s =sum(n-1);
        int ans =n +sum(n-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    
}
