/*
Jay Schenke
9/22/22
Greatest Common Divisor
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // Ask for two integers
    System.out.print("Enter first integer: ");
    int num1 = scn.nextInt();
    System.out.print("Enter second integer: ");
    int num2 = scn.nextInt();
    System.out.println();

    int gcd = 1;
    int k = 2;

    while (k <= num1 && k <= num2) {
      if (num1 % k == 0 && num2 % k == 0) {
        gcd = k;
      }
      k++;
    }

    System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
    scn.close();
  }
}
