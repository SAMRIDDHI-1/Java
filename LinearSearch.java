public class LinearSearch {
    public static void main(String args[]){
        int numbers[]={2,4,5,7,8,9,10 ,34,12};
        int key = 10;
        for (int i = 1 ; i<= numbers.length; i++){
            if(numbers[i]== key)
            {
                System.out.println("Key is at index "+ i);
            }
        }

    }
    
}
