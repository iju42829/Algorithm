package baekjoon.silver.silver_III;

import java.io.*;

public class Problem1913 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int targetNumber = Integer.parseInt(br.readLine());

        int[][] maps = new int[n][n];

        int startIndex = n / 2;
        int loopCount = n / 2;

        maps[startIndex][startIndex] = 1;

        int currentX = startIndex - 1, currentY = startIndex;
        int move = 2;
        int currentNumber = 2;

        for (int i = 0; i < loopCount; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < move; k++) {
                    maps[currentX][currentY] = currentNumber;
                    if (k + 1 != move) {
                        currentX += dx[j];
                        currentY += dy[j];
                    }

                    if (k + 1 == move && j + 1 < 4) {
                        currentX += dx[j + 1];
                        currentY += dy[j + 1];
                    }
                    currentNumber++;
                }

            }
            move += 2;
            currentX -= 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(maps[i][j] + " ");
            }
            bw.write("\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (maps[i][j] == targetNumber) {
                    bw.write((i + 1) + " " + (j + 1) + "\n");
                }
            }
        }

        bw.close();
        br.close();
    }
}
