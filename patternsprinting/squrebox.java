package patternsprinting;

public class squrebox{
    public static void main(String[] args){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5;j++){
                if(i==1|| j==1 || j==n || i==n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}