package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem1021 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final LinkedList<Integer> deque = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]), m = Integer.parseInt(inputs[1]);

        int count = 0;

        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        int[] targets = new int[m];

        inputs = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            targets[i] = Integer.parseInt(inputs[i]);
        }

        for (int target : targets) {
            int index = deque.indexOf(target);
            int left = index;
            int right = deque.size() - index;

            if (left <= right) {
                for (int i = 0; i < left; i++) {
                    deque.addLast(deque.pollFirst());
                    count++;
                }
            } else {
                for (int i = 0; i < right; i++) {
                    deque.addFirst(deque.pollLast());
                    count++;
                }
            }

            deque.pollFirst();
        }

        bw.write(count + "\n");
        bw.close();
        br.close();
    }
}
