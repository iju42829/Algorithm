package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem17219 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Map<String, String> map = new HashMap<>();
    private static int n, m;

    public static void main(String[] args) throws IOException {
        init();
        String result = solve();

        bw.write(result);

        bw.close();
        br.close();
    }

    private static String solve() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String search = br.readLine();

            sb.append(map.get(search)).append('\n');
        }

        return sb.toString();
    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            map.put(st.nextToken(), st.nextToken());
        }
    }
}
