package baekjoon.silver.silver_III;

import java.io.*;

public class Problem10974 {

    private static final BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));
    private static final StringBuilder sb = new StringBuilder();
    private static boolean[] visited;
    private static int[] selected;
    private static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        selected = new int[n];
        visited = new boolean[n + 1];

        dfs(0);

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    private static void dfs(int depth) {
        if (depth == n) {
            for (int i = 0; i < n; i++) {
                sb.append(selected[i]).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                selected[depth] = i;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}
