package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem32215 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();

    int result = m * (k + 1);

    System.out.println(result);
  }
}
