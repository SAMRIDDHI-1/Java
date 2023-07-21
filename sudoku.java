public class sudoku {
    public static boolean isSafe(int row , int col, int sudoku[][] , int digit){
        for(int i =0 ; i<=8 ; i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        for(int j =0 ; j<=8 ; j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr ; i<sr+3;i++){
            for(int j =sc ; j<sc+3 ; j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int row , int col , int sudoku[][]){
        if(row==9  ){
            return true;
        }
        
        int nextRow = row ;
        int nextCol = col+1;
        if(col+1 == 9){
            nextRow= row +1;
            nextCol=0;
        }
        if (sudoku[row][col] != 0){
            return sudokuSolver(nextRow, nextCol, sudoku);
        } 

        for (int digit =0; digit<=8; digit++ ){
            if(isSafe(row, col, sudoku, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(nextRow, nextCol, sudoku)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static void printsudoku(int sudoku[][]){
        for(int i =0 ; i<9; i++){
            for(int j=0 ; j<9;j++){
                System.out.print(sudoku[i][j]+" , ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};
        if(sudokuSolver(0, 0, sudoku)){
            System.out.println("solution exist");
            printsudoku(sudoku);
        }
        else{
            System.out.println("Solution dos not exist");
        }
    }
}
