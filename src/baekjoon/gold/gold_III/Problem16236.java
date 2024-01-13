package baekjoon.gold.gold_III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem16236 {
    static int n;
    static final int[] dx = {0, 0, 1, -1};
    static final int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            init(br);

            bfs();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void init(BufferedReader br) throws IOException {
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());

        Shark.map = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                Shark.map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void bfs() {
        findShark();

        while (true) {
            Shark.fishList = new ArrayList<>();
            Shark.dist = new int[n][n];

            while (!Shark.moveQueue.isEmpty()) {
                Node node = Shark.moveQueue.poll();

                rotation(node);
            }

            if (Shark.fishList.isEmpty()) {
                System.out.println(Shark.totalMoveDistance);
                return;
            }

            Collections.sort(Shark.fishList);
            Node nowFish = Shark.fishList.get(0);

            Shark.map[nowFish.x][nowFish.y] =  0;
            Shark.totalMoveDistance += nowFish.distance;
            Shark.eatFishCount++;

            if (Shark.size == Shark.eatFishCount) {
                Shark.size++;
                Shark.eatFishCount = 0;
            }

            Shark.moveQueue.add(new Node(nowFish.x, nowFish.y));
        }
    }

    private static void rotation(Node node) {
        for (int i = 0; i < 4; i++) {
            int nx = node.x + dx[i];
            int ny = node.y + dy[i];

            if (0 <= nx && nx < n && 0 <= ny && ny < n) {

                if (Shark.dist[nx][ny] == 0 &&
                        Shark.map[nx][ny] <= Shark.size) {

                    Shark.dist[nx][ny] = Shark.dist[node.x][node.y] + 1;
                    Shark.moveQueue.add(new Node(nx, ny, Shark.dist[nx][ny]));

                    if (1 <= Shark.map[nx][ny] && Shark.map[nx][ny] <= 6 && Shark.map[nx][ny] < Shark.size) {

                        Shark.fishList.add(new Node(nx, ny, Shark.dist[nx][ny]));
                    }
                }
            }
        }
    }

    private static void findShark() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Shark.map[i][j] == 9) {
                    Shark.moveQueue.add(new Node(i, j, 0));
                    Shark.map[i][j] = 0;
                }
            }
        }
    }
}

class Shark {
    public static final Queue<Node> moveQueue = new LinkedList<>();
    public static ArrayList<Node> fishList;
    public static int[][] map;
    public static int[][] dist;

    public static int size = 2;
    public static int eatFishCount = 0;
    public static int totalMoveDistance = 0;
}

class Node implements Comparable<Node> {
    int x;
    int y;
    int distance;

    public Node(int x, int y) {
        this(x, y, 0);
    }

    public Node(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node o) {
        if (this.distance != o.distance)
            return this.distance - o.distance;

        else if (this.x != o.x)
            return this.x - o.x;

        else
            return this.y - o.y;
    }
}