package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem1261 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        var inputs = br.readLine().split(" ");

        var n = Integer.parseInt(inputs[0]);
        var m = Integer.parseInt(inputs[1]);

        var maps = new int[m][n];
        var visited = new boolean[m][n];

        for (var i = 0; i < m; i++) {
            inputs = br.readLine().split("");

            for (var j = 0; j < n; j++) {
                maps[i][j] = Integer.parseInt(inputs[j]);
            }
        }

        var pq = new PriorityQueue<Node>();
        pq.add(new Node(0, 0, 0));
        visited[0][0] = true;

        while (!pq.isEmpty()) {
            var poll = pq.poll();

            if (poll.x == m - 1 && poll.y == n - 1) {
                bw.write(poll.wall + "\n");
                break;
            }

            for (var i = 0; i < 4; i++) {
                var nx = poll.x + dx[i];
                var ny = poll.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= m || ny >= n)
                    continue;

                if (visited[nx][ny])
                    continue;

                if (maps[nx][ny] == 1) {
                    pq.add(new Node(nx, ny, poll.wall + 1));
                } else {
                    pq.add(new Node(nx, ny, poll.wall));
                }

                visited[nx][ny] = true;
            }
        }

        bw.close();
        br.close();
    }

    static class Node implements Comparable<Node> {
        int x;
        int y;
        int wall;

        Node(int x, int y, int wall) {
            this.x = x;
            this.y = y;
            this.wall = wall;
        }

        @Override
        public int compareTo(Node o) {
            return this.wall - o.wall;
        }
    }
}
