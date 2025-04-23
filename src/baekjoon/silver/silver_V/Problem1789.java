package baekjoon.silver.silver_V;

import java.io.*;

public class Problem1789 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        long n = Long.parseLong(br.readLine());
        long number = 0;
        long numberCount = 1;

        while (true) {
            number += numberCount;

            if (number > n) {
                break;
            }

            numberCount++;
        }

        bw.write(numberCount - 1 + "\n");
        bw.close();
        br.close();
    }
}
