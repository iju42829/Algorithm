package baekjoon.bronze.bronze_IV;

import java.io.*;
import java.util.*;

public class Problem11945 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      String line = br.readLine();

      sb.append(new StringBuilder(line).reverse()).append("\n");
    }

    System.out.println(sb.toString());
  }
}
