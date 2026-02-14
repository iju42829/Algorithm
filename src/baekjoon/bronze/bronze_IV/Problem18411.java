package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem18411 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

    int sum = a + b + c;
    int min = Math.min(a, Math.min(b, c));

    System.out.println(sum - min);
  }
}
