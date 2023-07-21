import java.util.* ;
public class Array {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[]= new int [5];
        marks[0]=6;
        marks[1]=655;
        marks[2]=16;
        marks[3]=65;
        marks[4]=26;
        for(int i = 0; i<5;i++)
        {
        System.out.println(marks[i]);
    }
    for(int i = 0; i<5;i++)
        {
        marks[i]= marks[i]+1;
    }
       
        for(int i = 0 ; i<5;i++)
        {
        System.out.println(marks[i]);
    }
    }
    
}