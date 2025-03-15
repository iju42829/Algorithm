package baekjoon.silver.silver_I;

import java.io.*;
import java.util.*;

public class Problem9934 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<List<Integer>> result = new ArrayList<>();
    private static boolean[] visited;
    private static int[] tree;
    private static int k;

    public static void main(String[] args) throws IOException {
        init();
        solve(0, tree.length - 1, 0);

        for (List<Integer> numbers : result) {
            for (Integer number : numbers) {
                bw.write(number + " ");
            }
            bw.newLine();
        }

        bw.close();
        br.close();
    }

    private static void solve(int start, int end, int depth) {
        if (depth == k)
            return;

        int mid = (start + end) / 2;
        result.get(depth).add(tree[mid]);

        solve(start, mid, depth + 1);
        solve(mid + 1, end, depth + 1);
    }

    private static void init() throws IOException {
        k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++)
            result.add(new ArrayList<>());

        int n = (1 << k) - 1;

        tree = new int[n];
        visited = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            tree[i] = Integer.parseInt(st.nextToken());
    }
}
