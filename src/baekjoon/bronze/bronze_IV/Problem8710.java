package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem8710 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long k = sc.nextLong(), w = sc.nextLong(), m = sc.nextLong();

    if (k >= w) {
      System.out.println(0);
    } else {
      long result = (w - k + m - 1) / m;
      System.out.println(result);
    }
  }
}
