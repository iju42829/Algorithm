package baekjoon.silver.silver_II;

import java.io.*;
import java.util.StringTokenizer;

public class Problem16953 {
    private static long result = Long.MAX_VALUE;

    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            long a = Integer.parseInt(st.nextToken());
            long b = Integer.parseInt(st.nextToken());

            dfs(a, b, 1);

            if (result == Long.MAX_VALUE) {
                bw.write("-1\n");

            } else {
                bw.write(result + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void dfs(long currentNumber, long n, long depth) {
        if (currentNumber > n) {
            return;
        }

        if (currentNumber == n) {
            result = Math.min(result, depth);
        }

        dfs(currentNumber * 2, n, depth + 1);
        dfs(Long.parseLong(currentNumber + "1"), n, depth + 1);
    }
}