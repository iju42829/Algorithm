package baekjoon.gold.gold_V;

import java.io.*;
import java.util.*;

public class Problem15686 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final List<Position> houseList = new ArrayList<>();
    private static final List<Position> chickenList = new ArrayList<>();
    private static Position[] selectedChickenArr;
    private static int n, m, resultDistance = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        init();
        dfs(0, 0);

        bw.write(resultDistance + "\n");

        bw.close();
        br.close();
    }

    private static void dfs(int depth, int start) {
        if (depth == m) {
            simulation();
            return;
        }

        for (int i = start; i < chickenList.size(); i++) {
            selectedChickenArr[depth] = chickenList.get(i);
            dfs(depth + 1, i + 1);
        }
    }

    private static void simulation() {
        int distance = 0;

        for (Position house : houseList) {
            int tempDistance = Integer.MAX_VALUE;
            for (int i = 0; i < m; i++) {
                Position chicken = selectedChickenArr[i];

                tempDistance = Math.min(tempDistance, Math.abs(house.x - chicken.x) + Math.abs(house.y - chicken.y));
            }

            distance += tempDistance;
        }

        resultDistance = Math.min(distance, resultDistance);
    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        selectedChickenArr = new Position[m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                int number = Integer.parseInt(st.nextToken());

                if (number == 1)
                    houseList.add(new Position(i, j));

                else if (number == 2)
                    chickenList.add(new Position(i, j));
            }
        }
    }
}

class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
