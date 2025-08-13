package baekjoon.silver.silver_IV;

import java.io.*;

public class Problem1748 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        int adder = 1;
        int check = 10;

        for (int i = 1; i <= n; i++) {
            if (check == i) {
                check *= 10;
                adder++;
            }
            if (i < check)
                count += adder;
        }

        bw.write(count + "\n");
        bw.close();
        br.close();
    }
}
