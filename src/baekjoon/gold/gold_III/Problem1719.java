package baekjoon.gold.gold_III;

import java.io.*;
import java.util.*;

public class Problem1719 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<List<Edge>> graph = new ArrayList<>();
    private static final StringBuilder sb = new StringBuilder();
    private static StringTokenizer st;
    private static int[][] resultArr;
    private static int n, m;

    public static void main(String[] args) throws IOException {
        init();
        solve();
        bw.write(sb.toString());

        bw.close();
        br.close();
    }

    private static void solve() {
        for (int i = 1; i <= n; i++)
            dijkstra(i);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (resultArr[i][j] == 0)
                    sb.append("-").append(" ");
                else
                    sb.append(resultArr[i][j]).append(" ");
            }
            sb.append("\n");
        }
    }

    private static void dijkstra(int start) {
        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(start, 0));
        dist[start] = 0;
        resultArr[start][start] = 0;

        while (!pq.isEmpty()) {
            Edge now = pq.poll();

            int nowVertex = now.vex;
            int nowCost = now.cost;
            if (nowCost > dist[nowVertex]) continue;

            for (Edge edge : graph.get(nowVertex)) {
                if (dist[edge.vex] > nowCost + edge.cost) {
                    dist[edge.vex] = nowCost + edge.cost;
                    pq.add(new Edge(edge.vex, nowCost + edge.cost));

                    if (nowVertex == start)
                        resultArr[start][edge.vex] = edge.vex;
                    else
                        resultArr[start][edge.vex] = resultArr[start][nowVertex];
                }
            }
        }

    }


    private static void init() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        resultArr = new int[n+1][n+1];

        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }
    }

    static class Edge implements Comparable<Edge> {
        public int vex;
        public int cost;

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
