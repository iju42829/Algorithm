package baekjoon.gold.gold_V;

import java.io.*;
import java.util.*;

public class Problem14891 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int[][] wheelArr = new int[4][8];

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        init();

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int wheelSelected = Integer.parseInt(st.nextToken()) - 1;
            int direction = Integer.parseInt(st.nextToken());

            simulation(wheelSelected, direction);

        }

        int result = 0;

        for (int i = 0; i < 4; i++) {
            result += wheelArr[i][0] * (int) Math.pow(2, i);
        }

        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static void simulation(int wheelSelected, int currentDirection) {
        boolean[] visited = new boolean[4];

        Queue<Status> queue = new ArrayDeque<>();
        queue.offer(new Status(wheelSelected, currentDirection));
        visited[wheelSelected] = true;

        int[] dirs = new int[4];
        dirs[wheelSelected] = currentDirection;

        while (!queue.isEmpty()) {
            Status status = queue.poll();

            int leftWheel = status.wheelSelected - 1;

            if (leftWheel >= 0 && !visited[leftWheel]) {
                if (wheelArr[leftWheel][2] != wheelArr[status.wheelSelected][6]) {
                    dirs[leftWheel] = -status.direction;
                    visited[leftWheel] = true;
                    queue.offer(new Status(leftWheel, -status.direction));
                }
            }

            int rightWheel = status.wheelSelected + 1;

            if (rightWheel < 4 && !visited[rightWheel]) {
                if (wheelArr[rightWheel][6] != wheelArr[status.wheelSelected][2]) {
                    dirs[rightWheel] = -status.direction;
                    visited[rightWheel] = true;
                    queue.offer(new Status(rightWheel, -status.direction));
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            rotate(i, dirs[i]);
        }
    }

    static class Status {
        int wheelSelected;
        int direction;

        public Status(int wheelSelected, int direction) {
            this.wheelSelected = wheelSelected;
            this.direction = direction;
        }
    }

    private static void rotate(int wheelSelected, int direction) {
        int[] wheel = wheelArr[wheelSelected];

        if (direction == 1) {
            int temp = wheel[7];

            for (int i = 7; i > 0; i--) {
                wheel[i] = wheel[i - 1];
            }
            wheel[0] = temp;
        }
        else if (direction == -1) {
            int temp = wheel[0];

            for (int i = 0; i < 7; i++) {
                wheel[i] = wheel[i+1];
            }

            wheel[7] = temp;
        }
    }

    private static void init() throws IOException {
        for (int i = 0; i < 4; i++) {
            char[] input = br.readLine().toCharArray();

            for (int j = 0; j < 8; j++) {
                wheelArr[i][j] = input[j] - '0';
            }
        }
    }
}
