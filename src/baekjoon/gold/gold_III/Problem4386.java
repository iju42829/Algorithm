package baekjoon.gold.gold_III;

import java.io.*;
import java.util.*;

public class Problem4386 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<Edge> graph = new ArrayList<>();
    private static double result = 0;
    private static int[] unf;
    private static int n;

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        init();

        Collections.sort(graph, (e1, e2) -> Double.compare(e1.cost, e2.cost));

        for (Edge edge : graph) {
            int a = edge.a;
            int b = edge.b;

            if (find(a) != find(b)) {
                result += edge.cost;
                union(a, b);
            }
        }

        print();
    }

    private static void print() throws IOException {
        bw.write(String.format("%.2f\n", result));
        bw.close();
        br.close();
    }

    private static void init() throws IOException {
        n = Integer.parseInt(br.readLine());
        unf = new int[n];

        for (int i = 0; i < n; i++) {
            unf[i] = i;
        }

        double[][] starArr = new double[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            starArr[i][0] = Double.parseDouble(st.nextToken());
            starArr[i][1] = Double.parseDouble(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double distance = Math.sqrt(Math.pow(starArr[i][0] - starArr[j][0], 2) +  Math.pow(starArr[i][1] - starArr[j][1], 2));

                graph.add(new Edge(i, j, distance));
            }
        }
    }

    private static int find(int v) {
        if (unf[v] == v) return v;
        return unf[v] = find(unf[v]);
    }

    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);

        if (fa != fb)
            unf[fb] = fa;
    }

    static class Edge {
        int a;
        int b;
        double cost;

        public Edge(int a, int b, double cost) {
            this.a = a;
            this.b = b;
            this.cost = cost;
        }
    }
}
