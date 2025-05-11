package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem10451 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final StringBuilder sb = new StringBuilder();
    private static boolean[] visited;
    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            arr = new int[n+1][2];
            visited = new boolean[n+1];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {
                int temp = Integer.parseInt(st.nextToken());
                arr[j][0] = j;
                arr[j][1] = temp;
            }

            for (int j = 1; j <= n; j++) {
                if (visited[j]) continue;
                count++;
                visited[j] = true;
                dfs(j);
            }

            sb.append(count).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    private static void dfs(int startIndex) {
        if (!visited[arr[startIndex][1]]) {
            visited[arr[startIndex][1]] = true;
            dfs(arr[startIndex][1]);
        }
    }
}
