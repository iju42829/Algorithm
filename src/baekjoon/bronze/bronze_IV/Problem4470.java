package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem4470 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());

    for (int i = 1; i <= N; i++) {
      String line = sc.nextLine();
      System.out.println(i + ". " + line);
    }
  }
}
