package baekjoon.gold.gold_V;

import java.io.*;

public class Problem2023 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final StringBuilder sb = new StringBuilder();
    private static int n;

    public static void main(String[] args) throws IOException {
        solve();

        bw.write(sb.toString());

        bw.close();
        br.close();
    }

    private static void dfs(int num, int depth) {
        if (depth == n) {
            sb.append(num).append("\n");
            return;
        }

        for (int i = 1; i <= 9; i++) {
            int temp = num * 10 + i;

            if (isPrime(temp)) {
                dfs(temp, depth + 1);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;
        return true;
    }

    private static void solve() throws IOException {
        n = Integer.parseInt(br.readLine());
        int[] numbers = {2, 3, 5, 7};

        for (int number : numbers)
            dfs(number, 1);
    }
}
