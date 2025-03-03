package baekjoon.silver.silver_III;

import java.io.*;

public class Problem11727 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        bw.write(solve() + "\n");

        bw.close();
        br.close();
    }

    private static int solve() throws IOException {
        int[] dp = new int[1001];
        int n = Integer.parseInt(br.readLine());

        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i <= 1000; i++)
            dp[i] = (dp[i-1] + (2 * dp[i-2])) % 10007;

        return dp[n];
    }
}
