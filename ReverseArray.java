public class ReverseArray {
    public static void main(String args[]){
        int numbers[]={ 2 , 3 , 5 , 7 ,9};

        int first =0 ;int last = numbers.length -1;
        while(first<last){
            int temp = numbers[first];
            numbers[first]= numbers[last];
            numbers[last]= temp;
            first ++;
            last--;
        }
        for(int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }   
    
}
