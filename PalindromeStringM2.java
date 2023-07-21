import java.util.*;
public class PalindromeStringM2 {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string to be checked");
        String str = sc.nextLine();
        boolean f=true;;
        for(int i =0 ; i<str.length()/2; i++){
            int n= str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                f=false;
            }
            
        }
        if(f==true){
                System.out.println("Palindrome");            
        }
        else{
            System.out.println("not a palindrome");
        }
        
}
}
