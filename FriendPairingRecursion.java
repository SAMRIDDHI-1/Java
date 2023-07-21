public class FriendPairingRecursion {
    public static  int FrndPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1 = FrndPairing(n-1);
         int fnm2 = FrndPairing(n-2);
         int pairways = n*fnm2;
         int totalways = fnm1 + pairways;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(FrndPairing(3));
    }
    
}
