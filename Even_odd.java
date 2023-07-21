import java.util.*;
public class Even_odd
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nuber");
        int n = sc.nextInt();
        if(n%2 == 0)
        System.out.println(n+ " is EVen ");
        else
        System.out.println(n+ " is Odd ");
    }
}