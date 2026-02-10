package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem11549 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int count = 0;

    for (int i = 0; i < 5; i++) {
      int ans = sc.nextInt();
      if (ans == t) count++;
    }

    System.out.println(count);
  }
}
