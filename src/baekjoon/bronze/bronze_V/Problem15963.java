package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem15963 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong(), m = sc.nextLong();

    if (n == m) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
