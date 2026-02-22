package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem28113 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();

    if (n > b) {
      System.out.println("Bus");
      return;
    }

    if (a < b) {
      System.out.println("Bus");
    } else if (a > b) {
      System.out.println("Subway");
    } else {
      System.out.println("Anything");
    }
  }
}
