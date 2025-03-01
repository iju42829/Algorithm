package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem4963 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int[] dx = {-1, 1, 0, 0, -1, 1, 1, -1}, dy = {0, 0, -1, 1, 1, -1, 1, -1};
    private static StringTokenizer st;
    private static Queue<int[]> queue;
    private static boolean[][] visited;
    private static int[][] maps;
    private static int w, h;

    public static void main(String[] args) throws IOException {
        String result = solve();

        bw.write(result);

        bw.close();
        br.close();
    }

    private static String solve() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int count = 0;
            st = new StringTokenizer(br.readLine());

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            init();

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && maps[i][j] == 1) {
                        bfs(i, j);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }

        return sb.toString();
    }

    private static void bfs(int x, int y) {
        visited[x][y] = true;
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] position = queue.poll();

            for (int i = 0; i < 8; i++) {
                int nx = position[0] + dx[i];
                int ny = position[1] + dy[i];

                if (nx < 0 || ny < 0 || nx >= h || ny >= w)
                    continue;

                if (visited[nx][ny])
                    continue;

                if (maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }

    private static void init() throws IOException {
        maps = new int[h][w];
        queue = new ArrayDeque<>();
        visited = new boolean[h][w];

        for (int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < w; j++)
                maps[i][j] = Integer.parseInt(st.nextToken());
        }
    }
}
