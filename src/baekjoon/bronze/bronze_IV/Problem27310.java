package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem27310 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    int colonCnt = 0, underCnt = 0;

    for (char c : input.toCharArray()) {
      if (c == ':') {
        colonCnt++;
      } else if (c == '_') {
        underCnt++;
      }
    }

    System.out.println(input.length() + colonCnt + (underCnt * 5));
  }
}
