import java.util.*;
public class MaxAreaHistogram {
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsr[]= new int [arr.length];
        int nsl[]= new int [arr.length];

        Stack<Integer> s = new Stack<>();
        
        

        for(int i = arr.length -1 ; i>=0 ; i--){
            //while
            while(!s.isEmpty() && arr[s.peek()] >= arr[i])
            {
                s.pop();
            }
            //if else
            if(s.isEmpty()){
                nsr[i]= arr.length;
            }
            else{
                nsr[i]= s.peek();
            }
            //push in s
            s.push(i);
        }


        //Next Smaller Left

        s= new Stack<>();
        for(int i = 0 ; i<arr.length ; i++){
            //while
            while(!s.isEmpty() && arr[s.peek()] >= arr[i])
            {
                s.pop();
            }
            //if else
            if(s.isEmpty()){
                nsl[i]= -1;
            }
            else{
                nsl[i]= s.peek();
            }
            //push in s
            s.push(i);
        }

        //Area
        for(int i=0 ; i<arr.length ; i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height *width;
            maxArea = Math.max(maxArea, currArea);
        }
        
        System.out.println("Max area = "+maxArea);
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
    }
}
