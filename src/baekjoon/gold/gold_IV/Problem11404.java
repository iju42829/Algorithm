package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem11404 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<List<Edge>> graph = new ArrayList<>();
    private static int n, m;

    public static void main(String[] args) throws IOException {
        init();

        String result = solve();
        bw.write(result);

        bw.close();
        br.close();
    }

    private static String solve() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int[] dis = new int[n+1];
            Arrays.fill(dis, Integer.MAX_VALUE);

            PriorityQueue<Edge> pq = new PriorityQueue<>();
            pq.offer(new Edge(i, 0));
            dis[i] = 0;

            while (!pq.isEmpty()) {
                Edge nowEdge = pq.poll();
                int nowVertex = nowEdge.vertex;
                int nowCost = nowEdge.cost;

                if (dis[nowVertex] < nowCost) continue;

                for (Edge edge : graph.get(nowVertex)) {
                    if (dis[edge.vertex] > nowCost + edge.cost) {
                        dis[edge.vertex] = nowCost + edge.cost;
                        pq.offer(new Edge(edge.vertex, edge.cost + nowCost));
                    }
                }
            }

            for (int k = 1; k <= n; k++) {
                if (dis[k] != Integer.MAX_VALUE)
                    sb.append(dis[k]).append(" ");
                else
                    sb.append(0).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    private static void init() throws IOException {
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Edge(b, c));
        }
    }

    static class Edge implements Comparable<Edge> {
        int vertex;
        int cost;

        public Edge(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return cost - o.cost;
        }
    }
}
