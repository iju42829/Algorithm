package baekjoon.bronze.bronze_III;

import java.io.*;
import java.util.*;

public class Problem31009 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int[] costs = new int[N];
        int maxCost = -1;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String dest = st.nextToken();
            int cost = Integer.parseInt(st.nextToken());
            costs[i] = cost;

            if (dest.equals("jinju")) {
                maxCost = cost;
            }
        }

        int cnt = 0;
        for (int cost : costs) {
            if (cost > maxCost) cnt++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(maxCost).append('\n');
        sb.append(cnt).append('\n');
        System.out.print(sb.toString());
  }
}
