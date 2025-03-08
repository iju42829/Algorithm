package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem14938 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<List<Edge>> graph = new ArrayList<>();
    private static StringTokenizer st;
    private static int[] itemArr;
    private static int n, m, r;

    public static void main(String[] args) throws IOException {
        init();
        int result = solve();

        bw.write(result + "\n");
        br.close();
        bw.close();
    }

    private static int solve() {
        int result = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int simulationResult = simulation(i);

            result = Math.max(result, simulationResult);
        }

        return result;
    }

    private static int simulation(int start) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(start, 0));

        int[] distance = new int[n+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        while (!pq.isEmpty()) {
            Edge now = pq.poll();
            int nowVertex = now.vertex;
            int nowCost = now.cost;

            if (nowCost > distance[nowVertex]) continue;

            for (Edge edge : graph.get(nowVertex)) {
                if (distance[edge.vertex] > edge.cost + nowCost) {
                    distance[edge.vertex] = edge.cost + nowCost;
                    pq.add(new Edge(edge.vertex, edge.cost + nowCost));
                }
            }
        }

        int res = 0;

        for (int i = 1; i <= n; i++) {
            if (distance[i] <= m)
                res += itemArr[i];
        }

        return res;
    }

    private static void init() throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        itemArr = new int[n + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++)
            itemArr[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Edge(b, cost));
            graph.get(b).add(new Edge(a, cost));
        }
    }

    static class Edge implements Comparable<Edge> {
        public int vertex;
        public int cost;

        public Edge(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
}
