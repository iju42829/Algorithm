package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem2578 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int[][] maps = new int[5][5];

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {
                maps[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {
                queue.add(Integer.parseInt(st.nextToken()));
            }
        }

        int count = 1;

        while (!queue.isEmpty()) {
            findAndRemove(queue.poll());

            if (check()) {
                break;
            }

            count++;
        }

        bw.write(count + "\n");
        bw.close();
        br.close();
    }

    private static void findAndRemove(int number) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (maps[i][j] == number) {
                    maps[i][j] = -1;
                    return;
                }
            }
        }
    }

    private static boolean check() {
        int count = 0;

        for (int i = 0; i < 5; i++) {
            boolean flag = true;

            for (int j = 0; j < 5; j++) {
                if (maps[i][j] != -1) {
                    flag = false;
                    break;
                }
            }

            if (flag) count++;
        }

        for (int i = 0; i < 5; i++) {
            boolean flag = true;

            for (int j = 0; j < 5; j++) {
                if (maps[j][i] != -1) {
                    flag = false;
                    break;
                }
            }

            if (flag) count++;
        }

        boolean lastFlag = true;

        for (int i = 0; i < 5; i++) {
            if (maps[i][i] != -1) {
                lastFlag = false;
                break;
            }
        }
        if (lastFlag) count++;

        lastFlag = true;

        for (int i = 0; i < 5; i++) {
            if (maps[i][4-i] != -1) {
                lastFlag = false;
                break;
            }
        }

        if (lastFlag) count++;

        return count >= 3;
    }
}
