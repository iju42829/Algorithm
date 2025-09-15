package baekjoon.silver.silver_IV;

import java.io.*;

public class Problem4134 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());

            if (n <= 1) {
                bw.write("2\n");
                continue;
            }

            while (true) {
                boolean flag = true;

                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    bw.write(n + "\n");
                    break;
                }
                n++;
            }
        }

        bw.close();
        br.close();
    }
}
