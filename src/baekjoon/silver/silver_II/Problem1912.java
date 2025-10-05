package baekjoon.silver.silver_II;

import java.io.*;

public class Problem1912 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");

        int[] numbers = new int[n], dp = new int[n];

        for (int i = 0; i < n; i++) numbers[i] = Integer.parseInt(inputs[i]);

        dp[0] = numbers[0];
        int answer = numbers[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(numbers[i], dp[i-1] + numbers[i]);
            answer = Math.max(answer, dp[i]);
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
