package baekjoon.silver.silver_I;

import java.io.*;
import java.util.*;

public class Problem1406 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        char[] input = br.readLine().toCharArray();

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for (char c : input) {
            leftStack.push(c);
        }

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if (order.equals("L")) {
                if (!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
            }

            if (order.equals("D")) {
                if (!rightStack.isEmpty()) {
                    leftStack.push(rightStack.pop());
                }
            }

            if (order.equals("B")) {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            }

            if (order.equals("P")) {
                leftStack.push(st.nextToken().charAt(0));
            }
        }

        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }

        StringBuilder sb = new StringBuilder();

        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }

        bw.write(sb.toString() + "\n");
        bw.close();
        br.close();
    }
}
