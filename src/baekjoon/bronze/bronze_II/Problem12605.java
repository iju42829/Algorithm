package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem12605 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());

    for (int i = 1; i <= n; i++) {
      String line = sc.nextLine();
      String[] words = line.split(" ");

      System.out.printf("Case #%d: ", i);

      for (int j =  words.length - 1; j >= 0; j--) {
        System.out.print(words[j]);

        if (j > 0)
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}
