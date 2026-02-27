package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem10996 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n == 1) {
      System.out.println("*");
      return;
    }

    for (int i = 1; i <= 2 * n; i++) {

      if (i % 2 == 1) {  
        for (int j = 0; j < n; j += 2) {
          System.out.print("*");
          if (j + 2 < n) {
            System.out.print(" ");
          }
        }
      } else {  
        System.out.print(" ");
        for (int j = 1; j < n; j += 2) {
          System.out.print("*");
          if (j + 2 < n) {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}
