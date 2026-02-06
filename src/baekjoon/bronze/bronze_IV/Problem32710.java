package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem32710 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    boolean flag = false;

    for (int i = 2; i <= 9; i++) {
      if (n == i) 
        flag = true;
      for (int j = 1; j <= 9; j++) {
        if (j == n || i * j == n) {
          flag = true;
        }
      }
    }

    System.out.println(flag ? 1 : 0);
  }  
}
