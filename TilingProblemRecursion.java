public class TilingProblemRecursion {
    public static int Tiling(int n){
        if(n==0 || n==1)
        {
            return 1;
        }
        int fnm1=Tiling(n-1);
        int fnm2 = Tiling(n-2);
        int totalways= fnm1+ fnm2;
        return totalways;
    }
    public static void main(String args[]){
        System.out.println(Tiling(4));
    }
    
}
