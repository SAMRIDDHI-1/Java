import java.util.*;
public class except10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter no.");
            int n = sc.nextInt();
            if (n%10 ==0){
                continue;
            }
            System.out.println("the number is = "+n);
        }while(true);
    }
    
}
