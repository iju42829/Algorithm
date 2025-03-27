package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem1976 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] unf;

    public static void main(String[] args) throws IOException {
        String result = solve();

        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static int find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }

    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);

        if (fa != fb)
            unf[fb] = fa;
    }

    private static String solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        unf = new int[n + 1];
        for (int i = 0; i < n+1; i++)
            unf[i] = i;

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int input = Integer.parseInt(st.nextToken());

                if (input == 1) {
                    union(i, j);
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        boolean flag = true;
        int start = Integer.parseInt(st.nextToken());

        for (int i = 1; i < m; i++) {
            int temp = Integer.parseInt(st.nextToken());

            if (find(start) != find(temp)) {
                flag = false;
                break;
            }
        }

        return flag ? "YES" : "NO";
    }
}
