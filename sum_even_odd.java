import java.util.*;
public class sum_even_odd {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num , choice;
        int even_sum =0 , odd_sum = 0;
        do{
            System.out.println("enter any number");
            num= sc.nextInt();
            if(num%2==0){
                even_sum +=num;
            }
            else{
                odd_sum +=num;
            }
            System.out.println("Do you want to continue press 1 or press 0");
            choice = sc.nextInt();
        }while(choice==1);
        System.out.println("SUm of even number = "+even_sum);
        System.out.println("Sum of odd number = "+odd_sum);
    }
}
