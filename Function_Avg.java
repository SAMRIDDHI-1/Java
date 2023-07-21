import java.util.*;
public class Function_Avg {
    public static double Average(double a , double b , double c)
    {
        return (a+b+c)/3;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a ");
        double a = sc.nextDouble();
        System.out.println("Enter number b ");
        double b = sc.nextDouble();
        System.out.println("Enter number c ");
        double c = sc.nextDouble();
        System.out.println("Average = "+Average(a,b,c));
    }
    
}
