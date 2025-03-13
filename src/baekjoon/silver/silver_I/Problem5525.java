package baekjoon.silver.silver_I;

import java.io.*;

public class Problem5525 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static String input;
    private static int n, m, result = 0;

    public static void main(String[] args) throws IOException {
        solve();

        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static void solve() throws IOException {
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        input = br.readLine();
        int count = 0;

        for (int i = 0; i <= m - 3; i++) {
            if (input.charAt(i) == 'I' && input.charAt(i+1) == 'O' && input.charAt(i+2) == 'I') {
                count++;
                i++;

                if (count == n) {
                    result++;
                    count--;
                }
            }
            else count = 0;
        }
    }
}
