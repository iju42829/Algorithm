package baekjoon.gold;

import java.io.*;
import java.util.StringTokenizer;

public class Problem12865 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[][] result = new int[n+1][k+1];
            int[] weightArray = new int[n+1];
            int[] valueArray = new int[n+1];

            for (int i = 1; i <= n; i++) {
                st = new StringTokenizer(br.readLine());

                weightArray[i] = Integer.parseInt(st.nextToken());
                valueArray[i] = Integer.parseInt(st.nextToken());
            }

            dp(result, weightArray, valueArray, n, k);

            bw.write(result[n][k] + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void dp(int[][] result, int[] weightArray, int[] valueArray, int n, int k) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (weightArray[i] > j) {
                    result[i][j] = result[i-1][j];
                }
                else {
                    result[i][j] = Math.max(result[i-1][j], result[i-1][j - weightArray[i]] + valueArray[i]);
                }
            }
        }
    }
}