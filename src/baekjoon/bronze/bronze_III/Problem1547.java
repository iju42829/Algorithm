package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem1547 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt(), ball = 1;

    for (int i = 0; i < m; i++) {
      int x = sc.nextInt(), y = sc.nextInt();

      if (ball == x) ball = y;
      else if (ball == y) ball = x;
    }

    System.out.println(ball);
  }
}
