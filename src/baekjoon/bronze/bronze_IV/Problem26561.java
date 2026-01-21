package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem26561 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      long p = sc.nextLong();
      long t = sc.nextLong();

      long birth = t / 4;
      long death = t / 7;

      System.out.println(p + birth - death);
    }
  }
}
