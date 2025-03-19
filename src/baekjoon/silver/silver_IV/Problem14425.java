package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem14425 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Set<String> set = new HashSet<>();
    private static int n, m;

    public static void main(String[] args) throws IOException {
        init();
        int result = solve();

        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static int solve() throws IOException {
        int count = 0;

        for (int i = 0; i < m; i++) {
            String input = br.readLine();

            if (set.contains(input))
                count++;
        }
        return count;
    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++)
            set.add(br.readLine());
    }
}
