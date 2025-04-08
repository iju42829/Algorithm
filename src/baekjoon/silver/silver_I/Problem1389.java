package baekjoon.silver.silver_I;

import java.io.*;
import java.util.*;

public class Problem1389 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<List<Edge>> graph = new ArrayList<>();
    private static StringTokenizer st;
    private static int n, m;

    public static void main(String[] args) throws IOException {
        init();
        int result = solve();

        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static int solve() {
        int index = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int[] dist = new int[n+1];
            Arrays.fill(dist, Integer.MAX_VALUE);

            dijkstra(dist, i);

            int sum = 0;
            for (int j = 1; j <= n; j++)
                sum += dist[j];

            if (sum < result) {
                result = sum;
                index = i;

            } else if (sum == result && index > i) {
                index = i;
            }
        }

        return index;
    }

    public static void dijkstra(int[] dist, int start) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.add(new Edge(start, 0));

        while (!pq.isEmpty()) {
            Edge now = pq.poll();
            int nowVertex = now.vex;
            int nowCost = now.cost;

            if (dist[nowVertex] < nowCost) continue;

            for (Edge edge : graph.get(nowVertex)) {
                if (dist[edge.vex] > nowCost + edge.cost) {
                    dist[edge.vex] = nowCost + edge.cost;
                    pq.add(new Edge(edge.vex, nowCost + edge.cost));
                }
            }
        }
    }

    private static void init() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Edge(b, 1));
            graph.get(b).add(new Edge(a, 1));
        }
    }

    static class Edge implements Comparable<Edge> {
        int vex;
        int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
}
