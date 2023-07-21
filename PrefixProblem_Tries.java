import java.util.*;
public class PrefixProblem_Tries {
    static class Node{
        Node children []= new Node[26];
        boolean eow = false;
        int frequency ;

        public Node(){
            for(int i =0 ; i<children.length; i++){
                children[i] = null;
            }
            frequency = 1;
        }
    }
    public static Node root = new Node();
    public static void insert (String word){
        Node curr = root;
        for(int i = 0; i<word.length() ;i++){
            int idx = word.charAt(i) -'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            else{
                curr.children[idx].frequency++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key){
        Node curr = root;
        for(int level = 0; level < key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr= curr.children[idx];
        }
        return curr.eow == true;
    }
    public static void findPrefix(Node root, String ans ){
        if(root == null){
            return ;
        }

        if(root.frequency ==1){
            System.out.println(ans);
            return;
        }
        
        for(int i = 0; i<root.children.length;i++){
            if(root.children[i] != null){
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String[] args) {
         String arr[] = {"zebra" , "dog" , "duck" ,"dove"};
         for(int i = 0 ;i<arr.length;i++){
            insert(arr[i]);
         
         }
         root.frequency =-1;
         findPrefix(root, "");
    }
}
