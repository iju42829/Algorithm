package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem2644 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static List<List<Integer>> graph = new ArrayList<>();
    private static boolean[] visited;
    private static int n, a, b, m;
    private static boolean flag = true;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());

        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        dfs(a, 0);

        if (flag)
            System.out.println(-1);
    }

    private static void dfs(int v, int depth) {
        if (v == b) {
            System.out.println(depth);
            flag = false;
            return;
        }

        for (int next : graph.get(v)) {
            if (!visited[next]) {
                visited[next] = true;
                dfs(next, depth + 1);

                if (!flag)
                    return;
            }
        }
    }
}
