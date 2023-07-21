public class StaircaseSearch2D {
    public static void main(String args[]){
        int key =35;
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,9,37,48},{32,33,39,50}};
        Scs(matrix,key);
    }
        public static boolean Scs(int matrix[][] , int key){
        int row = 0, col = matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Found at ("+row+","+col+")");
                return true;
            }
            else if(key< matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
            
        }
        System.out.println("key not found");
        return  false;
    }
    
}