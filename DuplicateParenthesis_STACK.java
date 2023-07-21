import java.util.*;
public class DuplicateParenthesis_STACK {
    public static boolean isDuplicate(String s1){
        Stack<Character> s = new Stack<>();

        for(int i =0 ; i<s1.length();i++){
            char ch = s1.charAt(i);
            if(ch ==')'){
                int count =0;
                while(s.peek()!= '('){
                    s.pop();
                    count++;
                }
                if(count <1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "((a+b))";
        String s2 = "(a-b)";
        System.out.println(isDuplicate(s1));
    }
}
