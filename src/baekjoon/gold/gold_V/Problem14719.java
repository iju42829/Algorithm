package baekjoon.gold.gold_V;

import java.io.*;

public class Problem14719 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        int count = 0;
        int h, w;
        int[] blocks;
        int[][] map;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");

            h = Integer.parseInt(input[0]);
            w = Integer.parseInt(input[1]);

            map = new int[h][w];
            blocks = new int[w];

            input = br.readLine().split(" ");

            for (int i = 0; i < w; i++) {
                blocks[i] = Integer.parseInt(input[i]);
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (i < blocks[j])
                        map[i][j] = 1;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < h ; i++) {
            for (int j = 1; j < w - 1; j++) {
                if (map[i][j] == 1)
                    continue;

                boolean leftCheck = false;
                boolean rightCheck = false;

                int left = j;
                int right = j;

                while (left != 0) {
                    if (map[i][left - 1] == 1) {
                        leftCheck = true;
                        break;
                    }

                    left--;
                }

                while (right != w - 1) {
                    if (map[i][right+1] == 1) {
                        rightCheck = true;
                        break;
                    }

                    right++;
                }

                if (leftCheck && rightCheck) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}