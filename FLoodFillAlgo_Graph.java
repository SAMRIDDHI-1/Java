import java.util.*;
public class FLoodFillAlgo_Graph {

    public static void helper(int[][] image , int src , int sc , int color , boolean vis[][] , int orgCol){
        if(src<0 || sc<0 || src>= image.length || sc>= image[0].length
         || vis[src][sc] || image[src][sc] != orgCol ){
             
            return;
         }
         image[src][sc] = color;
        
        helper(image, src, sc-1, color, vis, orgCol);
        helper(image, src, sc+1, color, vis, orgCol);
        helper(image, src-1, sc, color, vis, orgCol);
        helper(image, src+1, sc, color, vis, orgCol);
    }

    public static int [][] floodfill(int [][] image , int src ,int sc , int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image , src , sc , color , vis , image[src][sc]);
        return image;
    }
    public static void main(String[] args) {
        int image[][] ={{1,1,1},
                        {1,1,0},
                        {1,0,1}};
        
        int src =1 , sc =1 , color=2;

        System.out.println(floodfill(image, src, sc, color));
    }
}
