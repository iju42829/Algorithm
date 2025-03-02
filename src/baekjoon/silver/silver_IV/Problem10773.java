package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem10773 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int k;

    public static void main(String[] args) throws IOException {
        int result = solve();

        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static int solve() throws IOException {
        k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0)
                stack.pop();
            else
                stack.push(num);
        }

        int result = 0;

        for (Integer num : stack)
            result += num;

        return result;
    }
}
