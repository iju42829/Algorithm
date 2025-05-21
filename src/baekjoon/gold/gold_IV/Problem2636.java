package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem2636 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
    private static Queue<int[]> queue;
    private static boolean[][] visited;
    private static int[][] maps;
    private static int n, m, result = 0, time = 0;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maps = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                maps[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (true) {
            visited = new boolean[n][m];
            queue = new ArrayDeque<>();

            dfs(0, 0);

            if (queue.isEmpty()) {
                break;
            } else {
                result = queue.size();

                while (!queue.isEmpty()) {
                    int[] cheese = queue.poll();
                    maps[cheese[0]][cheese[1]] = 0;
                }
            }

            time++;
        }

        bw.write(time + "\n");
        bw.write(result + "\n");

        br.close();
        bw.close();
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                continue;

            if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                queue.add(new int[]{nx, ny});
                visited[nx][ny] = true;

                continue;
            }

            if (!visited[nx][ny]) {
                visited[nx][ny] = true;
                dfs(nx, ny);
            }
        }
    }
}
