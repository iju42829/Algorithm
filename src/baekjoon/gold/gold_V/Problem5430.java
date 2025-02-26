package baekjoon.gold.gold_V;

import java.io.*;
import java.util.*;

public class Problem5430 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int t;

    public static void main(String[] args) throws IOException {
        init();
        String result = solve();

        bw.write(result);

        bw.close();
        br.close();
    }

    private static String solve() throws IOException {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String order = br.readLine();
            int n = Integer.parseInt(br.readLine());

            String temp = br.readLine();
            String[] input = temp.substring(1, temp.length() - 1).split(",");

            boolean flag = false;
            boolean errorFlag = false;

            Deque<String> deque = new ArrayDeque<>();
            if (n != 0) {
                for (String s : input)
                    deque.offer(s);
            }

            for (char o : order.toCharArray()) {
                if (o == 'R') {
                    flag = !flag;
                }

                else {
                    if (deque.isEmpty()) {
                        errorFlag = true;
                        break;
                    }
                    else if (flag) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }

            if (errorFlag) {
                sb.append("error\n");
            }

            else {
                sb.append("[");
                int size = deque.size();

                for (int k = 0; k < size -1; k++) {
                    if (flag)
                        sb.append(deque.pollLast()).append(",");
                    else
                        sb.append(deque.pollFirst()).append(",");
                }

                if (!deque.isEmpty())
                    sb.append(deque.poll()).append("]");
                else
                    sb.append("]");

                sb.append("\n");
            }
        }

        return sb.toString();
    }

    private static void init() throws IOException {
        t = Integer.parseInt(br.readLine());
    }
}
