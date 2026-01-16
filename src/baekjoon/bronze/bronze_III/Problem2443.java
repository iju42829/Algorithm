package baekjoon.bronze.bronze_III;

import java.io.*;

public class Problem2443 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine().trim());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < N; i++) {
      for (int s = 0; s < i; s++) sb.append(' ');

      int stars = 2 * (N - i) - 1;
      for (int k = 0; k < stars; k++) sb.append('*');

      if (i < N - 1) sb.append('\n');
    }

    System.out.print(sb.toString());
  }
}
