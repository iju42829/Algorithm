package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem5575 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      int h1 = sc.nextInt(), m1 = sc.nextInt(), s1 = sc.nextInt();
      int h2 = sc.nextInt(), m2 = sc.nextInt(), s2 = sc.nextInt();

      int start = h1 * 3600 + m1 * 60 + s1;
      int end = h2 * 3600 + m2 * 60 + s2;
      int diff = end - start;

      int h = diff / 3600;
      int m = (diff % 3600) / 60;
      int s = diff % 60;

      System.out.println(h + " " + m + " " + s);
    }
  }
}
