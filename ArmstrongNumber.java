
package assesment;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int originalNum = n;
        int result = 0;
        int temp = n;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10; 
        }

        temp = n; 
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, count);
            temp /= 10;
        }
        if (result == originalNum) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
        
        sc.close(); 
    }
}


