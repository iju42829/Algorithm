package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Problem16398 {
    private static List<Graph> graphs = new ArrayList<>();
    private static int[] parent;
    private static long result = 0;

    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            init(br);

            for (Graph graph : graphs) {
                if (findParent(graph.nodeFirstParent) != findParent(graph.nodeSecondParent)) {
                    union(graph.nodeFirstParent, graph.nodeSecondParent);

                    result += graph.cost;
                }
            }

            bw.write(result + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static int findParent(int node) {
        if (parent[node] == node) {
            return node;
        }

        return parent[node] = findParent(parent[node]);
    }

    private static void union(int a, int b) {
        int rootA = findParent(a);
        int rootB = findParent(b);

        if (rootA != rootB) {
            parent[rootB] = rootA;
        }
    }

    private static void init(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        parent = new int[n];

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                int cost = Integer.parseInt(st.nextToken());

                if (cost != 0 && !visited[i][j] && !visited[j][i]) {
                    Graph graph = new Graph(i, j, cost);

                    visited[i][j] = true;
                    visited[j][i] = true;

                    parent[i] = i;
                    parent[j] = j;

                    graphs.add(graph);
                }
            }
        }

        Collections.sort(graphs);
    }
}

class Graph implements Comparable<Graph>{
    public int nodeFirstParent;
    public int nodeSecondParent;
    public int cost;

    public Graph(int nodeFirstParent, int nodeSecondParent, int cost) {
        this.nodeFirstParent = nodeFirstParent;
        this.nodeSecondParent = nodeSecondParent;
        this.cost = cost;
    }

    @Override
    public int compareTo(Graph o) {
        return Integer.compare(this.cost, o.cost);
    }
}