import java.util.*;
public class ZigZag_LinkedList {
    public static  class Node{
        public int data;
        public Node next;
        Node(int data ){
            this.data = data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public void ZigZag(){
        Node slow = head ;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node left = head;
        Node right = prev;
        Node nextleft , nextRight;
        while(nextleft != null && right != null){
            nextleft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextleft;

            right = nextRight;
            left = nextleft;
        }
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println(ll);
        ll.ZigZag();
    }
}