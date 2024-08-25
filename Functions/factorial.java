package Functions;

import java.util.Scanner;

public class factorial {
    public static void fact(int n){
        if(n < 0){
            System.out.println("invalid No");
        }
        int factorial=1;
       for(int i=1;i<=n;i++){
            factorial = factorial*i;

       }
       System.out.println(factorial);
       return ;

    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int n= sc.nextInt();

         fact(n);

    }
    
}
