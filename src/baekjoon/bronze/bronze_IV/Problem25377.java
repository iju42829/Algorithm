package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem25377 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int ans = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt(), b = sc.nextInt();

      if (a <= b) {
        ans = Math.min(ans, b);
      }
    }

    if (ans == Integer.MAX_VALUE)
      System.out.println(-1);
    else
      System.out.println(ans);
  }
}
