package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem13410 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(), k = sc.nextInt();
    int max = 0;
    
    for (int i = 1; i <= k; i++) {
      int value = n * i;

      String reverse = new StringBuilder(String.valueOf(value)).reverse().toString();
      
      int reversedValue = Integer.parseInt(reverse);

      if (reversedValue > max) {
        max = reversedValue;
      }
    }

    System.out.println(max);
  }
}
