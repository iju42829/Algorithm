package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem1012 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
    private static StringTokenizer st;
    private static int t, m, n, k;
    private static int[][] maps;

    public static void main(String[] args) throws IOException {
        String result = solve();

        bw.write(result);

        bw.close();
        br.close();
    }

    private static String solve() throws IOException {
        StringBuilder sb = new StringBuilder();
        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            init();
            int count = bfs();
            sb.append(count).append("\n");
        }

        return sb.toString();
    }

    private static int bfs() {
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maps[i][j] == 1 && !visited[i][j]) {
                    visited[i][j] = true;

                    queue.add(new int[] {i, j});

                    while (!queue.isEmpty()) {
                        int[] cur = queue.poll();

                        for (int k = 0; k < 4; k++) {
                            int nx = cur[0] + dx[k];
                            int ny = cur[1] + dy[k];

                            if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                                continue;

                            if (!visited[nx][ny] && maps[nx][ny] == 1) {
                                visited[nx][ny] = true;
                                queue.add(new int[] {nx, ny});
                            }
                        }
                    }

                    count++;
                }
            }
        }

        return count;
    }

    private static void init() throws IOException {

        st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        maps = new int[n][m];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            maps[b][a] = 1;
        }
    }
}
