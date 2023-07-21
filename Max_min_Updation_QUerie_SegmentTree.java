import java.util.*;
public class Max_min_Updation_QUerie_SegmentTree {
     static int tree[];
    public static void initialise(int n){
        
        tree =new int[4*n];
    }
    public static void buildST(int arr[] , int i , int si , int sj){
        if(si==sj){
            tree[i] = arr[si];
            return ;
        }
        int mid = (si+sj)/2;
        buildST(arr, 2*i+1, si, mid);
        buildST(arr, 2*i+2,mid+1, sj);

        tree[i] = Math.max(tree[2*i+1],tree[2*i+2]);
        
    }
     public static int getmaxUtil( int i , int si , int sj ,int qi , int qj){
        if(qj < si || qi>sj){
            return Integer.MIN_VALUE;
        }else if(si>= qi && sj<=qj){
            return tree[i];
        }else{
            int mid= (si+sj)/2;
            int left = getmaxUtil(2*i+1,si, mid, qi, qj);
            int right= getmaxUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.max(left, right);
        }
    }
    public static int getMax(int arr[ ] , int qi , int qj){
        int n=arr.length;
        return getmaxUtil(0, 0, n-1, qi, qj);
    }

    public static void updateUtil(int i , int si ,int sj ,int idx , int newVal){
        if(idx>sj || idx<si){
            return;
        }
        if(si==sj){
            tree[i] = newVal;
        }
        if(si!=sj){
            
        tree[i] =Math.max(tree[i] , newVal);
            int mid = (si+sj)/2;
            updateUtil(2*i+1 ,si ,mid, idx, newVal);
            updateUtil(2*i+2, mid+1 , sj ,idx , newVal);
        }
    }
    





    public static void buildSTmin(int arr[] , int i , int si , int sj){
        if(si==sj){
            tree[i] = arr[si];
            return ;
        }
        int mid = (si+sj)/2;
        buildSTmin(arr, 2*i+1, si, mid);
        buildSTmin(arr, 2*i+2,mid+1, sj);

        tree[i] = Math.min(tree[2*i+1],tree[2*i+2]);
        
    }

     public static int getminUtil( int i , int si , int sj ,int qi , int qj){
        if(qj < si || qi>sj){
            return Integer.MAX_VALUE;
        }else if(si>= qi && sj<=qj){
            return tree[i];
        }else{
            int mid= (si+sj)/2;
            int left = getminUtil(2*i+1,si, mid, qi, qj);
            int right= getminUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.min(left, right);
        }
    }
    public static int getMin(int arr[ ] , int qi , int qj){
        int n=arr.length;
        return getminUtil(0, 0, n-1, qi, qj);
    }

    public static void updateUtilmin(int i , int si ,int sj ,int idx , int newVal){
        if(idx>sj || idx<si){
            return;
        }
        if(si==sj){
            tree[i] = newVal;
        }
        if(si!=sj){
            
        tree[i] =Math.min(tree[i] , newVal);
            int mid = (si+sj)/2;
            updateUtilmin(2*i+1 ,si ,mid, idx, newVal);
            updateUtilmin(2*i+2, mid+1 , sj ,idx , newVal);
        }
    }
    




    public static void update(int arr[] , int  idx , int newVal){
        arr[idx]= newVal;
        int n= arr.length;
        updateUtilmin(0, 0, n-1, idx, newVal);
    }
    
        public static void main(String[] args) {
        int arr[]={6,8, -1 ,2,17,1,3,2,4};
        int n= arr.length;
        initialise(n);
        buildST(arr, 0, 0, n-1);

       // for(int i=0 ; i<tree.length ; i++){
        //    System.out.print  (tree[i]+"  ");
        //}
        int max = getMax(arr, 2, 5);
        System.out.println(max);
    
    update(arr , 2,20);
     max = getMax(arr, 2, 5);
        System.out.println(max);

        int min = getMin(arr, 2, 5);
        System.out.println(min);
        update(arr, 2, 20);
        min= getMin(arr, 2, 5);
        System.out.println(min);
}
}