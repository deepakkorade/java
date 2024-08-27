package patternsprinting;

public class plussign {
    public static void main(String[] args){

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(" ");
                if(j==3 && i==3){
                    System.out.print("*");
                }else if(j==3||i==3){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
