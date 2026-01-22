package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem11966 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(), num = 0;

    for (int i = 0; i < 31; i++) {
      if (Math.pow(2, i) == n) {
        num = 1;
        break;
      }
    }

    System.out.println(num);
  }
}
