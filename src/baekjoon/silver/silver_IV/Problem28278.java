package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem28278 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        solve();
        bw.write(sb.toString());

        bw.close();
        br.close();
    }

    private static void solve() throws IOException {
        int x = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < x; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int order = Integer.parseInt(st.nextToken());

            if (order == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            }

            if (order == 2) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            }

            if (order == 3) {
                sb.append(stack.size()).append("\n");
            }

            if (order == 4) {
                if (stack.isEmpty())
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            }
            if (order == 5) {
                if (stack.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(stack.peek()).append("\n");
            }
        }
    }
}
