package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem25372 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < n; i++) {
      String input = sc.nextLine();

      if (input.length() >= 6 && input.length() <= 9)
        System.out.println("yes");
      else
        System.out.println("no");
    }
  }
}
