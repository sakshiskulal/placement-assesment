
import java.util.Scanner;



public class PrimeCheck {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");

    int n = sc.nextInt();

    int divisorCount = 0;

    for (int i = 1; i <= n; i++) {

      if (n % i == 0) {

        divisorCount++;

      }

    }

   

    if (divisorCount == 2) {

      System.out.println(n + " is a prime number.");

    } else {

      System.out.println(n + " is not a prime number.");

    }

    sc.close();

  }

}