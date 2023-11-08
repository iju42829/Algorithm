package baekjoon.silver.silver_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1932 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        int n;
        int result = 0;
        int[][] map;
        int[][] dp;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());

            map = new int[n][n];
            dp = new int[n][n];

            String[] input;

            for (int i = 0; i < n; i++) {
                input = br.readLine().split(" ");

                for (int j = 0; j < input.length; j++) {
                    map[i][j] = Integer.parseInt(input[j]);
                }
            }

            dp[0][0] = map[0][0];

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j] + map[i][j]);
                }

                else {
                    dp[i][j] = Math.max(dp[i][j], Math.max(dp[i-1][j-1] + map[i][j], dp[i-1][j] + map[i][j]));
                }
            }
        }

        for (int i = 0; i < n; i++) {
            result = Math.max(dp[n-1][i], result);
        }

        System.out.println(result);
    }
}