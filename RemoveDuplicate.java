public class RemoveDuplicate {
    public static void removeDuplicate(String s , int ind , StringBuilder newStr , boolean map[]){
        if(ind == s.length()){
            System.out.println(newStr);
            return;
        }
        char curr = s.charAt(ind);
        if(map[curr -'a']==true){
            removeDuplicate(s, ind+1, newStr, map);
        }
        else{
            map[curr-'a']=true;
            removeDuplicate(s, ind+1, newStr.append(curr), map);
        }
    }
    public static void main(String[] args) {
        String s = "aappnaacollege";
        removeDuplicate(s, 0, new StringBuilder(""), new boolean[26]);
    }
    
}
