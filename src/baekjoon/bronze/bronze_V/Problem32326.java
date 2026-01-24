package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem32326 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt();

    System.out.println(r * 3 + g * 4 + b * 5);
  }
}
