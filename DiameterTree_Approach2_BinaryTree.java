import java.util.*;
public class DiameterTree_Approach2_BinaryTree {
    
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
    public static int Diameter2(Node root){
        if(root == null){
            return 0;
        }
        int leftDia = Diameter2(root.left);
        int leftHei = Heigth(root.left);
        int rightDia = Diameter2(root.right);
        int rightHei = Heigth(root.right);

        int SelfDIa = leftHei+rightHei+1;
         
        return Math.max(SelfDIa , Math.max(leftDia , rightDia));

    }

    static class Info{
        int diam ;
        int ht;
        public Info (int diam , int ht){
            this .diam = diam ;
            this .ht = ht;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam , rightInfo.diam) , leftInfo.ht +rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) +1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);
         System.out.println(diameter(root).diam);
    }
}