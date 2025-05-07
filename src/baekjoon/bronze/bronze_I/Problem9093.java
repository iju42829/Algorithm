package baekjoon.bronze.bronze_I;

import java.io.*;
import java.util.*;

public class Problem9093 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            Stack<Character> stack = new Stack<>();

            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                char[] temp = st.nextToken().toCharArray();

                for (char c : temp) {
                    stack.push(c);
                }

                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(" ");

            }

            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.close();
        br.close();
    }
}
