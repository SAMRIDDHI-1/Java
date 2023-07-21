public class BinaryStringRecursion {
    public static void BinaryString(int  n , String s , int lastplace){
        if(n==0){
            System.out.println(s);
            return;
        }
        BinaryString(n-1, s+"0", 0);
        if(lastplace ==0 ){           
            BinaryString(n-1, s+"1", 1);
        }
    }
    public static void main(String[] args) {
        BinaryString(3, "", 0);
    }
    
}
