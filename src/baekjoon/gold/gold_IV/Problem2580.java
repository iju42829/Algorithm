package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem2580 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<Node> position = new ArrayList<>();
    private static final int[][] maps = new int[9][9];
    private static final StringBuilder sb = new StringBuilder();
    private static StringTokenizer st;
    private static boolean flag = false;

    public static void main(String[] args) throws IOException {
        init();
        dfs(0);

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    private static void init() throws IOException {
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int number = Integer.parseInt(st.nextToken());

                maps[i][j] = number;
                if (number == 0)
                    position.add(new Node(i, j));
            }
        }
    }

    private static void dfs(int depth) {
        if (depth == position.size()) {
            flag = true;

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(maps[i][j]).append(" ");
                }
                sb.append("\n");
            }

            return;
        }

        for (int i = 1; i <= 9; i++) {
            Node node = position.get(depth);

            if (check(node.x, node.y, i)) {
                maps[node.x][node.y] = i;
                dfs(depth + 1);
                if (flag) return;
                maps[node.x][node.y] = 0;
            }
        }
    }

    private static boolean check(int x, int y, int value) {
        for (int i = 0; i < 9; i++)
            if (maps[i][y] == value) return false;

        for (int i = 0; i < 9; i++)
            if (maps[x][i] == value) return false;

        int row = (x / 3) * 3;
        int col = (y / 3) * 3;

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (maps[i][j] == value) return false;
            }
        }

        return true;
    }

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
