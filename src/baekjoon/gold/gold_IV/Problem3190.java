package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem3190 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int[] X_ROTATE = {0, 1, 0, -1};
    private static final int[] Y_ROTATE = {1, 0, -1, 0};
    private static Queue<Order> orders = new LinkedList<>();
    private static int[][] maps;
    private static int n;

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        init();

        Deque<Position> deque = new ArrayDeque<>();
        int currentTime = 0;
        int currentDirection = 0;

        deque.add(new Position(0, 0));

        while (true) {
            Position pos = deque.peekFirst();
            int currentX = pos.x;
            int currentY = pos.y;

            Order tempOrder = orders.peek();

            if (!orders.isEmpty() && currentTime == tempOrder.time) {
                orders.poll();

                currentDirection = rotate(currentDirection, tempOrder.direction);
            }

            int nx = currentX + X_ROTATE[currentDirection];
            int ny = currentY + Y_ROTATE[currentDirection];

            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                break;
            }

            boolean flag = false;

            for (Position position : deque) {
                if (position.x == nx && position.y == ny) {
                    flag = true;
                    break;
                }
            }

            if (flag)
                break;

            deque.offerFirst(new Position(nx, ny));

            if (maps[nx][ny] == 1) {
                maps[nx][ny] = 0;
            } else {
                deque.pollLast();
            }

            currentTime++;
        }

        bw.write((currentTime + 1) + "\n");
        bw.close();
        br.close();
    }

    private static int rotate(int direction, String order) {
        if (order.equals("D"))
            direction = direction + 1;
        else if (order.equals("L"))
            direction = direction - 1;

        if (direction == -1)
            return 3;
        else if (direction == 4)
            return 0;

        return direction;
    }

    private static void init() throws IOException {
        n = Integer.parseInt(br.readLine());
        maps = new int[n][n];

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            maps[x-1][y-1] = 1;
        }

        int l = Integer.parseInt(br.readLine());


        for (int i = 0; i < l ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();

            orders.add(new Order(time, direction));
        }
    }



    static class Order {
        int time;
        String direction;

        public Order(int time, String direction) {
            this.time = time;
            this.direction = direction;
        }
    }

    static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
