package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem9252 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static char[] stringA, stringB;
    private static int a, b;

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        init();

        int[][] dp = new int[a + 1][b + 1];

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (stringA[i] == stringB[j]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        int startA = a, startB = b;
        int startPoint = dp[a][b];
        StringBuilder sb = new StringBuilder();

        while (true) {
            if (startPoint == 0)
                break;

            if (dp[startA-1][startB] == startPoint) {
                startA--;
            } else if (dp[startA][startB-1] == startPoint) {
                startB--;
            } else {
                sb.append(stringA[startA]);
                startPoint--;
                startA--;
                startB--;
            }
        }

        bw.write(dp[a][b] + "\n");
        bw.write(sb.reverse().toString());
        bw.close();
        br.close();
    }

    private static void init() throws IOException {
        String inputA = br.readLine();
        String inputB = br.readLine();

        a = inputA.length();
        b = inputB.length();

        stringA = new char[inputA.length() + 1];
        stringB = new char[inputB.length() + 1];

        for (int i = 1; i <= inputA.length(); i++) {
            stringA[i] = inputA.charAt(i - 1);
        }

        for (int i = 1; i <= inputB.length(); i++) {
            stringB[i] = inputB.charAt(i - 1);
        }
    }
}
