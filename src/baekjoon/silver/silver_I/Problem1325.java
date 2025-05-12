package baekjoon.silver.silver_I;

import java.io.*;
import java.util.*;

public class Problem1325 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static List<List<Integer>> graph = new ArrayList<>();
    private static int[] result;
    private static boolean[] visited;
    private static  int n, m;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        result = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
        }

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            dfs(i);
        }

        int max = Arrays.stream(result).max().getAsInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (result[i] == max) {
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb);
    }

    static void dfs(int now) {
        visited[now] = true;

        for (int next : graph.get(now)) {
            if (!visited[next]) {
                result[next]++;
                dfs(next);
            }
        }
    }

}
