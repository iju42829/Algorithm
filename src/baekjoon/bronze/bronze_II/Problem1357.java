package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem1357 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String X = sc.next();
    String Y = sc.next();

    String revX = new StringBuilder(X).reverse().toString();
    int tempX = Integer.parseInt(revX);

    String revY = new StringBuilder(Y).reverse().toString();
    int tempY = Integer.parseInt(revY);

    String result = new StringBuilder(String.valueOf(tempX + tempY)).reverse().toString();
      
    System.out.println(Integer.parseInt(result));
  }  
}
