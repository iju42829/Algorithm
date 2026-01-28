package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem16561 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int k = n / 3;

    System.out.println((long)(k-1) * (k-2) / 2);
  }
}
