package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem24479 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<List<Integer>> graph = new ArrayList<>();
    private static boolean[] visited;
    private static int[] order;
    private static int n, v, start, count = 1;

    public static void main(String[] args) throws IOException {
        init();
        dfs(start);
        print();
    }

    private static void print() {
        for (int i = 1; i <= n; i++) {
            System.out.println(order[i]);
        }
    }

    private static void dfs(int start) {
        visited[start] = true;
        order[start] = count++;

        for (int temp : graph.get(start)) {
            if (!visited[temp]) {
                dfs(temp);
            }
        }
    }

    private static void init() throws IOException {
        String[] inputs = br.readLine().split(" ");

        n = Integer.parseInt(inputs[0]);
        v = Integer.parseInt(inputs[1]);
        start = Integer.parseInt(inputs[2]);

        order = new int[n+1];
        visited = new boolean[n+1];

        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < v; i++) {
            inputs = br.readLine().split(" ");

            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 0; i <= n; i++) {
            Collections.sort(graph.get(i));
        }
    }

}
