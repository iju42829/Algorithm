package baekjoon.gold;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem14502 {
    private static int result = Integer.MIN_VALUE;

    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] map = new int[n][m];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < m; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            dfs(n, m, map, 0);

            bw.write(result + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void dfs(int n, int m, int[][] map, int depth) {
        if (depth == 3) {
            int[][] tempMap = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    tempMap[i][j] = map[i][j];
                }
            }

            bfs(n, m, tempMap);

            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    dfs(n, m, map, depth + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    private static void bfs(int n, int m, int[][] map) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<Position> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < m; j++) {
                if (map[i][j] == 2) {
                    queue.add(new Position(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Position pos = queue.poll();

            int x = pos.getX();
            int y = pos.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (map[nx][ny] == 0) {
                        queue.add(new Position(nx, ny));
                        map[nx][ny] = 2;
                    }
                }
            }
        }

        safeArea(n, m, map);
    }

    private static void safeArea(int n, int m, int[][] map) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    count++;
                }
            }
        }

        result = Math.max(count, result);
    }
}

class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}