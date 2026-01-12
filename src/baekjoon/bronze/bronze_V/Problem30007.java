package baekjoon.bronze.bronze_V;

import java.io.*;
import java.util.*;

public class Problem30007 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int x = Integer.parseInt(st.nextToken());
      
      sb.append(a * (x - 1) + b).append("\n");
    }

    System.out.println(sb.toString());
  }
}
