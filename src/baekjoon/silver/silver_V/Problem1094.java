package baekjoon.silver.silver_V;

import java.io.*;

public class Problem1094 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int result = solve();
        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static int solve() throws IOException {
        int x = Integer.parseInt(br.readLine());
        int stick = 64;
        int count = 0;

        while (x > 0) {
            if (stick > x) stick /= 2;
            else {
                x -= stick;
                count++;
            }
        }

        return count;
    }
}
