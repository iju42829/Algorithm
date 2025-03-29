package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem9019 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final StringBuilder sb = new StringBuilder();
    private static String a, b;
    private static int t;

    public static void main(String[] args) throws IOException {
        solve();

        bw.write(sb.toString());

        bw.close();
        br.close();
    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = st.nextToken();
        b = st.nextToken();
    }

    private static void bfs() {
        Queue<String[]> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[10000];
        queue.offer(new String[]{a, ""});
        visited[Integer.parseInt(a)] = true;
        int target = Integer.parseInt(b);

        while (!queue.isEmpty()) {
            String[] cur = queue.poll();
            int num = Integer.parseInt(cur[0]);
            if (cur[0].equals(b)) {
                sb.append(cur[1]).append("\n");
                return;
            }

            int next = (2 * num) % 10000;
            if (!visited[next]) {
                visited[next] = true;
                queue.offer(new String[]{String.valueOf(next), cur[1] + "D"});
            }

            next = (num == 0) ? 9999 : num - 1;
            if (!visited[next]) {
                visited[next] = true;
                queue.offer(new String[]{String.valueOf(next), cur[1] + "S"});
            }

            next = (num % 1000) * 10 + num / 1000;
            if (!visited[next]) {
                visited[next] = true;
                queue.offer(new String[]{String.valueOf(next), cur[1] + "L"});
            }

            next = (num % 10) * 1000 + num / 10;
            if (!visited[next]) {
                visited[next] = true;
                queue.offer(new String[]{String.valueOf(next), cur[1] + "R"});
            }
        }
    }

    private static void solve() throws IOException {
        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            init();
            bfs();
        }
    }
}
