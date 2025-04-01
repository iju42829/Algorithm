package baekjoon.silver.silver_II;

import java.io.*;

public class Problem9020 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final boolean[] isPrime = new boolean[10001];
    private static final StringBuilder sb = new StringBuilder();
    private static int t;


    public static void main(String[] args) throws IOException {
        init();
        solve();
        bw.write(sb.toString());

        bw.close();
        br.close();
    }

    private static void solve() throws IOException {
        for (int i = 0; i < t; i++) {
            int a = 0, b = 0;
            boolean flag = true;
            int n = Integer.parseInt(br.readLine());

            for (int j = 2; j <= n; j++) {
                if (!isPrime[j] && !isPrime[n-j]) {
                    if (flag) {
                        flag = false;
                        a = j;
                        b = n-j;
                    } else if (Math.abs(a - b) > Math.abs(j - (n - j))) {
                        a = j;
                        b = n-j;
                    }
                }
            }
            sb.append(a).append(" ").append(b).append("\n");
        }
    }

    private static void init() throws IOException {
        t = Integer.parseInt(br.readLine());

        isPrime[0] = true;
        isPrime[1] = true;

        for (int i = 2; i <= 10000; i++) {
            if (!isPrime[i]) {
                for (int j = i + i; j <= 10000; j += i) {
                    isPrime[j] = true;
                }
            }
        }
    }
}
