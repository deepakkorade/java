package Functions;

import java.util.Scanner;

public class logical {


    public static void main(String[] arg){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
        int b= sc.nextInt();
         
        if(a>b){
            System.out.println("a is greter than b");
        }
         else if(a==b) {
            System.out.println("no are some");
        }else{
            System.out.println("b is greter a");
        }

    }
    
}
