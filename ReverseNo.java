import java.util.*;
public class ReverseNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0)
        {
        int last_digit = n%10;
        System.out.print(last_digit);
        n= n/10;
        }
        System.out.println();


    }
    
}
