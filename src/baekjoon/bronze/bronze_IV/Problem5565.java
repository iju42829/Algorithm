package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem5565 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int total = sc.nextInt();

    int sum = 0;

    for (int i = 0; i < 9; i++) {
      sum += sc.nextInt();
    }

    System.out.println(total - sum);
  }
}
