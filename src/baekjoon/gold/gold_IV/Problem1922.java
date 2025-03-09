package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem1922 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<Edge> graph = new ArrayList<>();
    private static int[] unf;
    private static int n, m, result = 0;

    public static void main(String[] args) throws IOException {
        init();
        solve();
        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static void solve() {
        Collections.sort(graph);

        for (Edge edge : graph) {
            int a = edge.a;
            int b = edge.b;
            int cost = edge.cost;

            int fa = find(a);
            int fb = find(b);

            if (fa != fb) {
                union(a, b);
                result += cost;
            }
        }
    }

    private static int find(int v) {
        if (v == unf[v])
            return v;
        else
            return unf[v] = find(unf[v]);
    }

    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);

        if (fa != fb)
            unf[fb] = fa;
    }

    private static void init() throws IOException {
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        unf = new int[n + 1];

        for (int i = 0; i <= n; i++)
            unf[i] = i;

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph.add(new Edge(a, b, cost));
        }
    }

    static class Edge implements Comparable<Edge> {
        int a;
        int b;
        int cost;

        public Edge(int a, int b, int cost) {
            this.a = a;
            this.b = b;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
}
