public class BinarySearch {
    public static void main(String args []){
        int numbers[]={5,6,7,12,16,28,38,45,57,62,75};
        int key = 38;
        int start =0 ;
        int last = numbers.length-1;
        while(start<=last)
        {
            int mid = (start +last)/2;
            if(numbers[mid]== key){
                System.out.println("The number is at " + mid);
                break;
            }
            else if ( numbers[mid]>key){
                last = mid -1;

            }
            else{
                start = mid +1;
            }
        }
    }
    
}
