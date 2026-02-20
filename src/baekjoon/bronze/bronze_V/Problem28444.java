package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem28444 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt(), i = sc.nextInt(), a = sc.nextInt();
    int r = sc.nextInt(), c = sc.nextInt();

    System.out.println((h * i) - (a * r * c));
  }
}
