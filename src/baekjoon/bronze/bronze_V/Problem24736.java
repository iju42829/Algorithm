package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem24736 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t1 = sc.nextInt(), f1 = sc.nextInt(), s1 = sc.nextInt(), p1 = sc.nextInt(), c1 = sc.nextInt();
    int t2 = sc.nextInt(), f2 = sc.nextInt(), s2 = sc.nextInt(), p2 = sc.nextInt(), c2 = sc.nextInt();

    int a = (t1 * 6) + (f1 * 3) + (s1 * 2) + (p1 * 1) + (c1 * 2);
    int b = (t2 * 6) + (f2 * 3) + (s2 * 2) + (p2 * 1) + (c2 * 2);
    
    System.out.println(a + " " + b);
  }
}
