import java.util.*;
class Leap_year {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to be checked");
        int y = sc.nextInt();
        boolean x = (y%4)==0;
        boolean a = (y%100)!=0;
        boolean z = ((y%100==0) && (y%400==0));
        if(x && (a || z))
        {
            System.out.println("It's a Leap year");
        }
        else{
            System.out.println("It's not a Leap year");
        }
    }
    
}
