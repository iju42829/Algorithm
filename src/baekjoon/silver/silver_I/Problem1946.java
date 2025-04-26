package baekjoon.silver.silver_I;

import java.io.*;
import java.util.*;

public class Problem1946 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            List<int[]> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                list.add(new int[]{a, b});
            }

            Collections.sort(list, (n1, n2) -> n1[0] - n2[0]);

            int checkNumber = Integer.MAX_VALUE;
            int count = 0;

            for (int[] num : list) {
                if (checkNumber >= num[1]) {
                    checkNumber = num[1];
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
