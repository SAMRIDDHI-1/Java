public class PairArray {
    public static void main(String args[]){
        int numbers []={2,4,6,8,10};
        for(int i = 0 ; i<= numbers.length-1 ;i++){
            int curr = numbers[i];
            for(int j = i+1 ; j<numbers.length ; j++){
                System.out.print("( "+ curr + " , " + numbers[j] + ")");
            }
            System.out.println();
        } 
    }
    
}