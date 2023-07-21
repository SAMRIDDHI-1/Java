import java.util.*;
public class Fever{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("ENter your temperatur");
double temp = sc.nextDouble();
if (temp>100){
    System.out.println("You have fever");
}
else{
    System.out.println("You don't have fever");
}
}
}