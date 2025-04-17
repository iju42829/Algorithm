package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem2573 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int[] dx = {-1, 0, 1, 0}, dy = {0, -1, 0, 1};
    private static final Deque<Position> queue = new ArrayDeque<>();
    private static StringTokenizer st;
    private static int[][] maps;
    private static int n, m;

    public static void main(String[] args) throws IOException {
        int result = solve();

        bw.write(result + "\n");
        bw.close();
        br.close();
    }

    private static int solve() throws IOException {
        init();

        int day = 0;

        while (!queue.isEmpty()) {
            int queueSize = queue.size();

            for (int i = 0; i < queueSize; i++) {
                Position position = queue.poll();
                int point = position.point;

                for (int k = 0; k < 4; k++) {
                    int nx = position.x + dx[k];
                    int ny = position.y + dy[k];

                    if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                    if (maps[nx][ny] == 0) {
                        point--;
                    }
                }

                queue.addLast(new Position(position.x, position.y, point));
            }

            for (int i = 0; i < queueSize; i++) {
                Position position = queue.poll();

                int point = position.point;

                if (point <= 0) {
                    maps[position.x][position.y] = 0;

                } else {
                    maps[position.x][position.y] = position.point;
                    queue.addLast(position);
                }
            }

            day++;

            if (bfs() >= 2) {
                return day;
            }
        }

        return 0;
    }

    private static int bfs() {
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> bfsQueue = new ArrayDeque<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maps[i][j] != 0 && !visited[i][j]) {
                    count++;
                    bfsQueue.add(new int[]{i, j});
                    visited[i][j] = true;

                    while (!bfsQueue.isEmpty()) {
                        int[] position = bfsQueue.poll();

                        for (int k = 0; k < 4; k++) {
                            int nx = position[0] + dx[k];
                            int ny = position[1] + dy[k];

                            if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                            if (maps[nx][ny] != 0 && !visited[nx][ny]) {
                                visited[nx][ny] = true;
                                bfsQueue.add(new int[]{nx, ny});
                            }
                        }
                    }

                }
            }
        }

        return count;
    }

    private static void init() throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maps = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                int point = Integer.parseInt(st.nextToken());
                maps[i][j] = point;

                if (point != 0) {
                    queue.add(new Position(i, j, point));
                }
            }
        }
    }

    static class Position {
        int x;
        int y;
        int point;

        public Position(int x, int y, int point) {
            this.x = x;
            this.y = y;
            this.point = point;
        }
    }
}
