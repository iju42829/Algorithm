package baekjoon.bronze.bronze_III;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem2935 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    BigInteger a = new BigInteger(sc.nextLine());
    String operation = sc.nextLine();
    BigInteger b = new BigInteger(sc.nextLine());

    if (operation.equals("+")) {
      System.out.println(a.add(b).toString());
    } else {
      System.out.println(a.multiply(b).toString());
    }
  }
}
