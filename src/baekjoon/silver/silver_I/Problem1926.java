package baekjoon.silver.silver_I;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem1926 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int count = 0, area = Integer.MIN_VALUE, n, m;
    private static int[][] map;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] != 0) {
                    bfs(i, j);
                }
            }
        }

        bw.write(count + "\n");

        if (area == Integer.MIN_VALUE) {
            bw.write("0\n");
        } else {
            bw.write(area + "\n");
        }

        bw.close();
        br.close();
    }

    private static void bfs(int x, int y) {
        Queue<Position> queue = new ArrayDeque<>();
        queue.add(new Position(x, y));

        int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
        int tempArea = 1;
        map[x][y] = 0;

        while (!queue.isEmpty()) {
            Position position = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = position.x + dx[i];
                int ny = position.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                    continue;

                if (map[nx][ny] == 0)
                    continue;

                queue.add(new Position(nx, ny));
                map[nx][ny] = 0;
                tempArea++;
            }
        }

        count++;
        area = Math.max(tempArea, area);
    }

    static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
