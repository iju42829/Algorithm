package baekjoon.silver.silver_V;

import java.io.*;

public class Problem14916 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException{
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                count += n / 5;
                n -= 5 * (n / 5);
            }
            else{
                n-=2;
                count++;
            }
        }

        if (n < 0) {
            bw.write("-1\n");
        } else {
            bw.write(count + "\n");
        }

        bw.close();
        br.close();
    }
}
