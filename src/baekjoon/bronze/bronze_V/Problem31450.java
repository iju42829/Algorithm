package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem31450 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long m = sc.nextLong(), k = sc.nextLong();

    if (m % k == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
