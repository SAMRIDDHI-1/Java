public class Shortestpath {
    public static void main(String args[]){
        String path= "EEWNNSEeSNENN";
        int x=0;
        int y=0;
        for (int i=0; i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'S' || dir =='s'){
                y--;
            }
            else if(dir == 'N' || dir == 'n'){
                y++;
            }
            else if (dir == 'E' || dir =='e'){
                x++;
            }
            else if(dir == 'W'|| dir =='w'){
                x--;
            }
            else{
                System.out.println("Direction not found");
            }
        }
        int X2= x*x;
        int Y2=y*y;
        double D= Math.sqrt(X2+Y2);
        System.out.println("Distance = "+D);

    }

    
}
