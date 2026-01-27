package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem26566 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      double a1 = sc.nextDouble(), p1 = sc.nextDouble();

      double r1 = sc.nextDouble(), p2 = sc.nextDouble();

      double slice = a1 / p1;
      double whole = Math.PI * r1 * r1 / p2;

      if (whole > slice) {
        System.out.println("Whole pizza");
      } else {
        System.out.println("Slice of pizza");
      }
    }
  }
}
