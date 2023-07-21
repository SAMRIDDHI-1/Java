public class StringCompression {
    public static void main(String args[]){
        String str = "aaabbcdd";
        String s ="";
        for(int i =0 ; i<str.length(); i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count ++;
                i++;
            }
            s+=str.charAt(i);
            if(count >i){
                s+=count.toString();
            } 
        }
        System.out.println(s);
    }
    
}
