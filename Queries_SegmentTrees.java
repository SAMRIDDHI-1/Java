import java.util.*;
public class Queries_SegmentTrees {
    static int tree[];
    public static void initialise(int n){
        tree =new int[4*n];
    }
    public static int buildST(int arr[] , int i , int start , int end){
        if(start==end){
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = (start+end)/2;
        buildST(arr, 2*i+1, start, mid);
        buildST(arr, 2*i+2,mid+1, end);
        tree[i] = tree[2*i+1]+tree[2*i+2];
        return tree[i];
    }
    public static int getSUmUtil( int i , int si , int sj ,int qi , int qj){
        if(qj <= si || qi>=sj){
            return 0;
        }else if(si>= qi && sj<=qj){
            return tree[i];
        }else{
            int mid= (si+sj)/2;
            int left = getSUmUtil(2*i+1,si, mid, qi, qj);
            int right= getSUmUtil(2*i+2, mid+1, sj, qi, qj);
            return left+right;
        }
    }
    public static int getSUm(int arr[ ] , int qi , int qj){
        int n=arr.length;
        return getSUmUtil(0, 0, n-1, qi, qj);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n= arr.length;
        initialise(n);
        buildST(arr, 0, 0, n-1);

        for(int i=0 ; i<tree.length ; i++){
            System.out.print  (tree[i]+"  ");
        }
        System.out.println();;
        System.out.print(getSUm(arr, 2, 5)+" ");
    }
}
