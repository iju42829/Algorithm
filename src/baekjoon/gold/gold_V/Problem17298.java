package baekjoon.gold.gold_V;

import java.io.*;
import java.util.*;

public class Problem17298 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        stack.push(0);

        for (int i = 1; i < n; i++) {
            int number = arr[i];

            while (!stack.isEmpty() && arr[stack.peek()] < number) {
                arr[stack.peek()] = number;
                stack.pop();
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            arr[stack.peek()] = -1;
            stack.pop();
        }

        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + " ");
        }

        bw.close();
        br.close();
    }
}
