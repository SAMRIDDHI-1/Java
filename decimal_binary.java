public class decimal_binary {
    public static void DecToBin(int bin){
        int myNum=bin;
        int pow=0;
        int binNum=0;
        while(bin>0){
            int r=bin%2;
            binNum=binNum+(r*(int)(Math.pow(10,pow)));
            pow++;
            bin=bin/2;
        }
        System.out.println("Binary of "+ myNum +" = "+binNum);
    }
    public static void main(String args[]){
        DecToBin(5);
    }
}
