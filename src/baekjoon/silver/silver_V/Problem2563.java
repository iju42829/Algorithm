package baekjoon.silver.silver_V;

import java.io.*;
import java.util.*;

public class Problem2563 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] maps = new int[101][101];

        for (int k = 0; k < n; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    maps[i][j] = 1;
                }
            }
        }

        int count = 0;

        for (int i = 1; i < 101; i++) {
            for (int j = 1; j < 101; j++) {
                if (maps[i][j] == 1) {
                    count++;
                }
            }
        }

        bw.write(count + "\n");
        bw.close();
        br.close();
    }
}
