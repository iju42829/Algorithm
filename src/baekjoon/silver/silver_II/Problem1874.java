package baekjoon.silver.silver_II;

import java.io.*;
import java.util.Stack;

public class Problem1874 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        boolean result = solve();

        if (result) {
            bw.write(sb.toString());
        } else {
            bw.write("NO");
        }

        bw.close();
        br.close();
    }

    private static boolean solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int index = 0;
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            stack.push(i);
            sb.append("+").append("\n");

            while (!stack.isEmpty() && arr[index] == stack.peek()) {
                stack.pop();
                index++;
                sb.append("-").append("\n");
            }
        }

        return n == index;
    }
}
