package baekjoon.gold.gold_V;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem7576 {
    private static int m;
    private static int n;
    private static int result = 0;
    private static int[][] map;
    private static final Queue<Tomato> tomatoQueue = new LinkedList<>();
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            init(br);

            if (bfs()) {
                bw.write(result + "\n");

            } else {
                bw.write("-1\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void init(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == 1) {
                    tomatoQueue.add(new Tomato(i, j, 0));
                }
            }
        }
    }

    private static boolean bfs() {
        while (!tomatoQueue.isEmpty()) {
            Tomato tomato = tomatoQueue.poll();

            result = tomato.time;

            for (int i = 0; i < 4; i++) {
                int nx = tomato.x + dx[i];
                int ny = tomato.y + dy[i];

                if (0 <= nx && 0 <= ny && nx < n && ny < m) {
                    if (map[nx][ny] == 0) {
                        map[nx][ny] = 1;
                        tomatoQueue.add(new Tomato(nx, ny, tomato.time + 1));
                    }
                }
            }
        }

        return checkMap();
    }

    private static boolean checkMap() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}

class Tomato {
    int x;
    int y;
    int time;

    public Tomato(int x, int y, int time) {
        this.x = x;
        this.y = y;
        this.time = time;
    }
}