package baekjoon.bronze.bronze_II;

import java.util.*;

public class Problem2605 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int move = sc.nextInt();

      list.add(list.size() - move, i + 1);
    }

    for (int i : list) {
      System.out.print(i + " ");
    }
    
    System.out.println();
  }
}
