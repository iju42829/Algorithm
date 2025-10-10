package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.StringTokenizer;

public class Problem9372 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            var st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

            for (int j = 0; j < m; j++)
                st = new StringTokenizer(br.readLine());

            bw.write((n-1) + "\n");
        }

        bw.close();
        br.close();
    }
}
