package baekjoon.gold.gold_III;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Problem17299 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }  else {
                map.put(arr[i], 1);
            }
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < n; i++) {
            int result = map.get(arr[i]);

            while (!stack.isEmpty() && map.get(arr[stack.peek()]) < result) {
                arr[stack.peek()] = arr[i];
                stack.pop();
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            arr[stack.peek()] = -1;
            stack.pop();
        }

        for (int i : arr) {
            bw.write(i + " ");
        }

        bw.close();
        br.close();
    }
}
