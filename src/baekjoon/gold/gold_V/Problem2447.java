package baekjoon.gold.gold_V;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Problem2447 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));

    public static void main(String[] args) {
        try {
            solution();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());

        String[][] maps = new String[4][4];

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
               maps[i][j] = "*";
            }
        }

        maps[2][2] = " ";

        if (n != 3) {
            star(maps, 9, n);

        } else {
            printArray(maps,3);
        }
    }

    private static void printArray(String[][] maps, int n) throws IOException {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                bw.write(maps[i][j]);
            }

            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static void star(String[][] maps, int n, int depth) throws IOException {
        String[][] temp = new String[n + 1][n + 1];
        int cnt = 1;

        for (int i = 1; i < n; i += n / 3) {
            for (int j = 1; j < n; j += n / 3) {

                if (cnt == 5) {
                    for (int k = 1; k <= n / 3; k++) {
                        for (int l = 1; l <= n / 3; l++) {
                            temp[i+k-1][j+l-1] = " ";
                        }
                    }

                } else {
                    for (int k = 1; k <= n / 3; k++) {
                        for (int l = 1; l <= n / 3; l++) {
                            temp[i+k-1][j+l-1] = maps[k][l];
                        }
                    }
                }
                cnt++;
            }
        }


        if (n == depth) {
            printArray(temp, n);

            return;

        }

        star(temp, n * 3, depth);
    }
}