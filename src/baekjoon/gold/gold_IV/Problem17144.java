package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.StringTokenizer;

public class Problem17144 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[][] maps;
    private static int upAirCleaner = -1, downAirCleaner = -1;
    private static int r, c, t;

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    private static void solve() throws IOException {
        for (int i = 0; i < t; i++) {
            dustSimulation();
            upSimulation();
            downSimulation();
        }

        int answer = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (maps[i][j] != -1)
                    answer+= maps[i][j];
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }

    private static void upSimulation() {
        int currentX = upAirCleaner;
        int currentY = 1;

        int mem = maps[currentX][currentY];
        int direction = 0;

        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};

        while (true) {
            int nx = currentX + dx[direction];
            int ny = currentY + dy[direction];

            if (nx < 0 || ny < 0 || nx >= r || ny >= c) {
                direction++;
                continue;
            }

            int temp = maps[nx][ny];
            maps[nx][ny] = mem;
            mem = temp;

            currentX = nx;
            currentY = ny;

            if (currentX == downAirCleaner && currentY == 0) {
                maps[upAirCleaner][0] = -1;
                break;
            }
        }

        maps[upAirCleaner][1] = 0;
    }
    private static void downSimulation() {
        int currentX = downAirCleaner;
        int currentY = 1;

        int mem = maps[currentX][currentY];
        int direction = 0;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        while (true) {
            int nx = currentX + dx[direction];
            int ny = currentY + dy[direction];

            if (nx < 0 || ny < 0 || nx >= r || ny >= c) {
                direction++;
                continue;
            }

            int temp = maps[nx][ny];
            maps[nx][ny] = mem;
            mem = temp;

            currentX = nx;
            currentY = ny;

            if (currentX == downAirCleaner && currentY == 0) {
                maps[downAirCleaner][0] = -1;
                break;
            }
        }

        maps[downAirCleaner][1] = 0;
    }

    private static void dustSimulation() {
        int[][] tempMaps = new int[r][c];

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (maps[i][j] == -1) {
                    tempMaps[i][j] = -1;
                    continue;
                }

                tempMaps[i][j] += maps[i][j];

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx < 0 || ny < 0 || nx >= r || ny >= c)
                        continue;

                    if (maps[nx][ny] == -1)
                        continue;

                    tempMaps[nx][ny] += maps[i][j] / 5;
                    tempMaps[i][j] -= maps[i][j] / 5;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                maps[i][j] = tempMaps[i][j];
            }
        }
    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());

        maps = new int[r][c];

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < c; j++) {
                int temp = Integer.parseInt(st.nextToken());

                if (temp == -1) {
                    if (upAirCleaner == -1) {
                        upAirCleaner = i;
                    } else {
                        downAirCleaner = i;
                    }
                }

                maps[i][j] = temp;
            }
        }
    }
}
