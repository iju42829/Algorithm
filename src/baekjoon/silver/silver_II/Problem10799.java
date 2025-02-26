package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem10799 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static String stick;

    public static void main(String[] args) throws IOException {
        init();
        int result = solve();

        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static int solve() {
        int count = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < stick.length(); i++) {
            char c = stick.charAt(i);

            if (c == '(')
                stack.push(c);

            else {
                stack.pop();
                if (stick.charAt(i-1) == '(')
                    count += stack.size();
                else
                    count++;
            }
        }

        return count;
    }

    private static void init() throws IOException {
        stick = br.readLine();
    }
}
