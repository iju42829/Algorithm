package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem18258 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String order = st.nextToken();

            if (order.equals("push")) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            else if (order.equals("pop")) {
                if (deque.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(deque.pollFirst()).append("\n");
                }
            }

            else if (order.equals("size")) {
                sb.append(deque.size()).append("\n");
            }

            else if (order.equals("empty")) {
                if (deque.isEmpty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            }
            else if (order.equals("front")) {
                if (deque.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(deque.peekFirst()).append("\n");
                }
            }

            else if (order.equals("back")) {
                if (deque.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(deque.peekLast()).append("\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
