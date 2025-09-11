package baekjoon.silver.silver_I;

import java.io.*;
import java.util.*;

public class Problem6118 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<List<Integer>> graph = new ArrayList<>();
    private static int[] dist;

    public static void main(String[] args) throws IOException {
        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        dist = new int[n + 1];
        Arrays.fill(dist, -1);

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            inputs = br.readLine().split(" ");

            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        bfs(1);

        int maxDist = -1;
        int minIndex = Integer.MAX_VALUE;
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (dist[i] > maxDist) {
                maxDist = dist[i];
                minIndex = i;
                cnt = 1;
            } else if (dist[i] == maxDist) {
                cnt++;
            }
        }

        System.out.println(minIndex + " " + maxDist + " " + cnt);
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        dist[start] = 0;

        while (!queue.isEmpty()) {
            Integer current = queue.poll();

            for (int v : graph.get(current)) {
                if (dist[v] != -1) {
                    continue;
                }

                dist[v] = dist[current] + 1;
                queue.add(v);
            }
        }
    }
}
