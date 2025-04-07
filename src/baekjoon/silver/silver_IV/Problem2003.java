package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.StringTokenizer;

public class Problem2003 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int result = solve();

        bw.write(result + "\n");
        bw.close();
        br.close();
    }

    private static int solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] number = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        int rt = 0, lt = 0, sum = 0, count = 0;

        while (true) {
            if (sum == m)
                count++;

            if (sum >= m) {
                sum -= number[lt++];
            } else {
               if (rt < n) {
                   sum += number[rt++];
               } else {
                   break;
               }
            }
        }

        return count;
    }
}
