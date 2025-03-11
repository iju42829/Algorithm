package baekjoon.gold.gold_III;

import java.io.*;
import java.util.*;

public class Problem2206 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
    private static boolean[][][] visited;
    private static int[][] maps;
    private static int n, m;

    public static void main(String[] args) throws IOException {
        init();
        int result = solve();
        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static int solve() {
        Queue<Node> queue = new ArrayDeque<>();

        queue.add(new Node(0, 0, 0, 1));
        visited[0][0][0] = true;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.x == n - 1 && current.y == m - 1)
                return current.distance;

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                    continue;

                if (maps[nx][ny] == 0 && !visited[current.wallCheck][nx][ny]) {
                    visited[current.wallCheck][nx][ny] = true;
                    queue.add(new Node(nx, ny, current.wallCheck, current.distance + 1));
                }

                else if (maps[nx][ny] == 1 && current.wallCheck == 0 && !visited[1][nx][ny]) {
                    visited[1][nx][ny] = true;
                    queue.add(new Node(nx, ny, 1, current.distance + 1));
                }
            }
        }

        return -1;
    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[2][n][m];
        maps = new int[n][m];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++)
                maps[i][j] = input.charAt(j) - '0';
        }
    }

    static class Node {
        int x;
        int y;
        int wallCheck;
        int distance;

        public Node(int x, int y, int wallCheck, int distance) {
            this.x = x;
            this.y = y;
            this.wallCheck = wallCheck;
            this.distance = distance;
        }
    }
}
