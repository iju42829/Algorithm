package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem1966 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String result = solve();

        bw.write(result);
        bw.close();
        br.close();
    }

    private static String solve() throws IOException {
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int m = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            Queue<Node> queue = new ArrayDeque<>();

            String[] orders = br.readLine().split(" ");
            int indexCount = 0;

            for (String order : orders)
                queue.add(new Node(Integer.parseInt(order), indexCount++));

            int count = 0;
            while (!queue.isEmpty()) {
                Node cur = queue.poll();
                boolean flag = true;
                for (Node node : queue) {
                    if (node.cost > cur.cost) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    count++;

                    if (cur.index == target) {
                        sb.append(count).append("\n");
                        break;
                    }
                }
                else {
                    queue.offer(cur);
                }
            }
        }

        return sb.toString();
    }

    static class Node {
        int cost;
        int index;

        public Node(int cost, int index) {
            this.cost = cost;
            this.index = index;
        }
    }
}
