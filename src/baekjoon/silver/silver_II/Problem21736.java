package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem21736 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
    private static char[][] maps;
    private static int n, m;

    public static void main(String[] args) throws IOException {
        init();
        String result = solve();

        bw.write(result);

        bw.close();
        br.close();
    }

    private static String solve() {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maps[i][j] == 'I') {
                    count = bfs(i, j);
                }
            }
        }

        if (count == 0)
            sb.append("TT").append("\n");

        else
            sb.append(count).append("\n");

        return sb.toString();
    }

    private static int bfs(int startX, int startY) {
        maps[startX][startY] = 'X';
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startX, startY});
        int count = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (maps[nx][ny] != 'X') {
                    if (maps[nx][ny] == 'P') count++;

                    maps[nx][ny] = 'X';
                    queue.add(new int[]{nx, ny});
                }
            }
        }

        return count;
    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maps = new char[n][m];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            for (int j = 0; j < m; j++) {
                maps[i][j] = input.charAt(j);
            }
        }
    }
}
