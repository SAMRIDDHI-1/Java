import java.util.*;
public class calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter operator");
        char o = sc.next().charAt(0);
switch(o)
{
    case '+': System.out.println("Addition of no. "+ (a+b));
    break;
    case '-': System.out.println("Substration of no. "+ (a-b));
    break;
    case '*': System.out.println("Multiplication of no. "+ (a*b));
    break;
    case '/': System.out.println("Divison of no. "+ (a/b));
    break;
    case '%': System.out.println("Remainder of no. "+ (a%b));
    break;
    default :
    System.out.println("invalid character");
}        
    }
    
}
