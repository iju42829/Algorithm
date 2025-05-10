package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem1182 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int count = 0, n, s;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0, 0);

        bw.write(count + "\n");
        bw.close();
        br.close();
    }

    private static void dfs(int depth, int selected, int size) {
        if (depth == n) {
            if (selected == s && size != 0) count++;

            return;
        }

        dfs(depth + 1, selected + arr[depth], size + 1);
        dfs(depth + 1, selected, size);
    }
}
