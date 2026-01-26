package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem28352 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    long fact = 1L;

    for (int i = 1; i <= n; i++)
      fact *= i;

    System.out.println(fact / (7L * 24 * 60 * 60));
  }
}
