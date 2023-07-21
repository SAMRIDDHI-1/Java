import java.util.*;
public class PalindromeString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string to be checked");
        String str = sc.nextLine();
        String s= str;
        String s1="";
        for(int i = str.length()-1;i>=0;i--){
            s1=s1 + str.charAt(i);
        }
        if(s.toLowerCase().equals(s1.toLowerCase()))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
}
