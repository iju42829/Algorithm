package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem28279 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            if (input[0].equals("1")) {
                deque.addFirst(Integer.parseInt(input[1]));
            }

            else if (input[0].equals("2")) {
                deque.addLast(Integer.parseInt(input[1]));
            }

            else if (input[0].equals("3")) {
                if (deque.isEmpty())
                    sb.append(-1).append("\n");

                else
                    sb.append(deque.pollFirst()).append("\n");
            }

            else if (input[0].equals("4")) {
                if (deque.isEmpty())
                    sb.append(-1).append("\n");

                else
                    sb.append(deque.pollLast()).append("\n");
            }

            else if (input[0].equals("5")) {
                sb.append(deque.size()).append("\n");
            }

            else if (input[0].equals("6")) {
                if (deque.isEmpty())
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            }
            else if (input[0].equals("7")) {
                if (deque.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(deque.peekFirst()).append("\n");
            }
            else if (input[0].equals("8")) {
                if (deque.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(deque.peekLast()).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
