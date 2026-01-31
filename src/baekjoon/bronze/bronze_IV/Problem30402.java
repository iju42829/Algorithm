package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem30402 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 15; j++) {
        String input = sc.next();

        if (input.equals("w")) {
          System.out.println("chunbae");
          return;
        } else if (input.equals("b")) {
          System.out.println("nabi");
          return;
        } else if (input.equals("g")) {
          System.out.println("yeongcheol");
          return;
        }
      }
    }
  }
}
