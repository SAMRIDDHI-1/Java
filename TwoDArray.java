import java .util.*;
public class TwoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix [][]= new int[3][3];
        for(int i = 0 ; i<3; i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.println("Enter number at cell "+ i+"x"+j );
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i = 0 ; i<3; i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.print( matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}
