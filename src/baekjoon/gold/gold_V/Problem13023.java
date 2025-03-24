package baekjoon.gold.gold_V;

import java.io.*;
import java.util.*;

public class Problem13023 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<List<Integer>> graph = new ArrayList<>();
    private static StringTokenizer st;
    private static boolean[] visited;
    private static int n, m, result = 0;

    public static void main(String[] args) throws IOException {
        init();
        solve();
        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static void solve() {
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(0, i);
                visited[i] = false;
                if (result == 1) return;
            }
        }
    }

    private static void dfs(int depth, int start) {
        if (depth == 4) {
            result = 1;
            return;
        }

        for (int node : graph.get(start)) {
            if (!visited[node]) {
                visited[node] = true;
                dfs(depth + 1, node);
                if (result == 1) return;
                visited[node] = false;
            }
        }
    }

    private static void init() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n];

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
    }
}
