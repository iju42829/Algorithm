package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem5598 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    
    for (char c : input.toCharArray()) {
      if (c > 67) {
        sb.append((char) (c-3));
      } else {
        sb.append((char) (c+23));
      }
    }

    System.out.println(sb.toString());
  }
}
