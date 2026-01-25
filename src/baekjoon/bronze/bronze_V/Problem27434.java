package baekjoon.bronze.bronze_V;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem27434 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    System.out.println(fact(1, n));
  }

  public static BigInteger fact(int a, int n) {
    BigInteger number = BigInteger.valueOf(a);

    if (a < n) {
      int temp = (a + n) / 2;
      number = fact(a, temp).multiply(fact(temp+1, n));
    }

    return number;
  }
}
