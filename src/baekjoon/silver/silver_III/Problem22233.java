package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem22233 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final StringBuilder sb = new StringBuilder();
    private static final Set<String> set = new HashSet<>();
    private static int n, m;

    public static void main(String[] args) throws IOException {
        init();
        solve();
        bw.write(sb.toString());

        bw.close();
        br.close();
    }

    private static void solve() throws IOException {
        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(",");

            for (String s : input) {
                set.remove(s);
            }

            sb.append(set.size()).append("\n");
        }
    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++)
            set.add(br.readLine());
    }
}
