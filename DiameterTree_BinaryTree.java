import java.util.*;
public class DiameterTree_BinaryTree {
    static  class Node{
        int data;
        Node left ,right;
        public Node(int data){
            this .data = data;
            this.left =null;
            this.right=null;
        }
    }
    public static int Heigth(Node root){
        if(root == null){
            return 0;
        }
        int lh = Heigth(root.left);
        int rh = Heigth(root.right);
       return  Math.max(lh ,rh )+1;
    }
    public static int Diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDia = Diameter(root.left);
        int leftHei = Heigth(root.left);
        int rightDia = Diameter(root.right);
        int rightHei = Heigth(root.right);

        int SelfDIa = leftHei+rightHei+1;
         
        return Math.max(SelfDIa , Math.max(leftDia , rightDia));

    }
    public static void main(String[] args) {
        Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);
         System.out.println(Diameter(root));
    }
}
