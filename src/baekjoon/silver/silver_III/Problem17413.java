package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem17413 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static String s;

    public static void main(String[] args) throws IOException {
        init();
        String result = solve();

        bw.write(result);
        bw.close();
        br.close();
    }

    private static String solve() {
        StringBuilder sb = new StringBuilder();

        boolean flag = false;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '<') {
                while (!stack.isEmpty())
                    sb.append(stack.pop());

                flag = true;
                sb.append(c);

            } else if (c == '>') {
                flag = false;
                sb.append(c);

            } else if (flag) {
                sb.append(c);

            } else if (c == ' ') {
                while (!stack.isEmpty())
                    sb.append(stack.pop());
                sb.append(" ");

            } else {
                stack.push(c);
            }
        }
        while (!stack.isEmpty())
            sb.append(stack.pop());

        return sb.append(" \n").toString();
    }

    private static void init() throws IOException {
        s = br.readLine();
    }
}

