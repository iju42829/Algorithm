package baekjoon.bronze.bronze_IV;

import java.io.*;

public class Problem5357 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      String s = br.readLine();
      StringBuilder sb = new StringBuilder();

      sb.append(s.charAt(0));

      for (int j = 1; j < s.length(); j++) {
        if (s.charAt(j) != s.charAt(j-1)) {
          sb.append(s.charAt(j));
        }
      }
      System.out.println(sb.toString());
    }
  }
}
