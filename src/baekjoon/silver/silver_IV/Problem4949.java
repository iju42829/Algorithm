package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.Stack;

public class Problem4949 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String result = solve();

        bw.write(result);

        bw.close();
        br.close();
    }

    private static String solve() throws IOException {
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            if (input.equals(".")) break;
            boolean flag = true;

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c == '(' || c == '[')
                    stack.push(c);

                else if (c == ')' || c == ']'){
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    }

                    else if (c == ')' && stack.peek() == '(')
                        stack.pop();

                    else if (c == ']' && stack.peek() == '[')
                        stack.pop();

                    else {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag && stack.isEmpty())
                sb.append("yes").append("\n");

            else
                sb.append("no").append("\n");

        }

        return sb.toString();
    }
}
