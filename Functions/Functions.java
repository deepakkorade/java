package Functions;

import java.util.Scanner;

public class Functions {
    public static int calculate(int a, int b){
        int sum = a + b;
        return sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int a= sc.nextInt();
        int b= sc.nextInt();

        int sum = calculate(a,b);
        System.out.println(sum);

    }
    
}
