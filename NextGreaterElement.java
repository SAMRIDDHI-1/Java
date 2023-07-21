import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int ar[]= {6,8,0,1,3};
        Stack<Integer> s= new Stack<>();
        int nextGreator []= new int[(ar.length)];

        for(int i = ar.length -1 ; i>=0 ; i--){
            //while
            while(!s.isEmpty() && ar[s.peek()] <= ar[i])
            {
                s.pop();
            }
            //if else
            if(s.isEmpty()){
                nextGreator[i]= -1;
            }
            else{
                nextGreator[i]= ar[s.peek()];
            }
            //push in s
            s.push(i);
        }
        for (int i= 0 ; i< nextGreator.length ; i++){
            System.out.print(nextGreator[i]+" ");
        }
        System.out.println();
    }
}
