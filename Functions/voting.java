package Functions;

import java.util.Scanner;

public class voting {
    public static void main(String arg[]){
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         if(a>18){
            System.out.println("eligible to vote");
         }else{
            System.out.println("not eligible");
         }

         }
    
}
