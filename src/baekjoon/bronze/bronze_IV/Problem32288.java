package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem32288 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());
    String input = sc.nextLine();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);

      if (c == 'l') {
        sb.append("L");
      } else if (c == 'I') {
        sb.append("i");
      }
    }

    System.out.println(sb.toString());
  }
}
