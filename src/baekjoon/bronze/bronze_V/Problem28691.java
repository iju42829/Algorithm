package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem28691 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    switch (s) {
      case "M":
        System.out.print("MatKor");
        break;
      case "W":
        System.out.print("WiCys");
        break;
      case "C":
        System.out.print("CyKor");
        break;
      case "A":
        System.out.print("AlKor");
        break;
      case "$":
        System.out.print("$clear");
        break;
    }
  }
}
