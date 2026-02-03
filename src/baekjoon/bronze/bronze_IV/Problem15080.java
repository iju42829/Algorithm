package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem15080 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h1 = sc.nextInt();
    sc.next();
    int m1 = sc.nextInt();
    sc.next(); 
    int s1 = sc.nextInt();

    int h2 = sc.nextInt();
    sc.next();
    int m2 = sc.nextInt();
    sc.next();
    int s2 = sc.nextInt();

    int t1 = h1 * 3600 + m1 * 60 + s1;
    int t2 = h2 * 3600 + m2 * 60 + s2;

    if (t2 < t1) {
      t2 += 24 * 3600;
    }

    System.out.println(t2 - t1);
  }
}
