public class largest {
    public static void main (String args[]){
        int numbers[]= { 2, 3 , 4,5 ,6 , 10 };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i< numbers.length; i++){
            if (numbers[i] > max){
                max= numbers[i];
            }
            if (numbers[i] < min ){
                min= numbers[i];
            }
        }
        System.out.println("MAXIMUM number = "+ max);
        System.out.println("MINIMUM number = "+ min);
    }
}
