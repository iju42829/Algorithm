package baekjoon.bronze.bronze_II;

import java.util.*;

public class Problem9076 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      int[] scores = new int[5];
      
      for (int j = 0; j < 5; j++) {
        scores[j] = sc.nextInt();
      }

      Arrays.sort(scores);

      if (scores[3] - scores[1] >= 4) {
        System.out.println("KIN");
      } else {
        System.out.println(scores[1] + scores[2] + scores[3]);
      }
    }
  }
}
