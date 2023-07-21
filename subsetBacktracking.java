public class subsetBacktracking {
    public static void findsubset(String s , int i , String ans){
        if(i==s.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }        
        findsubset(s, i+1, ans+s.charAt(i));
        findsubset(s, i+1, ans);
    }
    public static void main(String args[]){
        findsubset("abc", 0, "");
    }
}
