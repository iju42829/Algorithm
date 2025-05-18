package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem10819 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] arr, selected;
    private static boolean[] visited;
    private static int n, result = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        selected = new int[n];
        visited = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);

        bw.write(result + "\n");
        bw.close();
        br.close();
    }

    private static void dfs(int depth) {
        if (depth == n) {
            int temp = 0;

            for (int i = 0; i < n - 1; i++) {
                temp += Math.abs(arr[selected[i]] - arr[selected[i + 1]]);
            }

            result = Math.max(result, temp);

            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                selected[depth] = i;

                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
