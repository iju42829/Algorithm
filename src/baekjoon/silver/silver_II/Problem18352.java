package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem18352 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<List<Integer>> graph = new ArrayList<>();
    private static int n, m, k, x;

    public static void main(String[] args) throws IOException {
        var st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        int[] dist = new int[n+1];
        Arrays.fill(dist, -1);

        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[n+1];
        visited[x] = true;
        queue.add(x);
        dist[x] = 0;

        while (!queue.isEmpty()) {
            Integer current = queue.poll();

            for (Integer temp : graph.get(current)) {
                if (!visited[temp]) {
                    dist[temp] = dist[current] + 1;
                    visited[temp] = true;
                    queue.add(temp);
                }
            }
        }

        boolean flag = false;

        for (int i = 1; i <= n; i++) {
            if (dist[i] == k) {
                flag = true;
                bw.write(i + "\n");
            }
        }

        if (!flag) {
            bw.write(-1 + "\n");
        }

        bw.close();
        br.close();
    }
}
