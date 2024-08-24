package logicalprogram;
import java.util.*;

public class Armstrongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int num, remainder, result = 0;
        int n = 0;

        num = number;
        while (num != 0) {
            num /= 10;
            n++;
        }
        num = number;

        while (num != 0) {
            remainder = num % 10;
            result += Math.pow(remainder, n);
            num /= 10;
        }
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
