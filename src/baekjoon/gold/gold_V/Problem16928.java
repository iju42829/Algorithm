package baekjoon.gold.gold_V;

import java.io.*;
import java.util.*;

public class Problem16928 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] maps = new int[101];
    private static StringTokenizer st;
    private static int n, m;


    public static void main(String[] args) throws IOException {
        init();
        int result = solve();

        bw.write(result + "\n");
        bw.close();
        br.close();
    }

    private static int solve() {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[101];
        queue.offer(1);
        visited[1] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int k = 0; k < size; k++) {
                int position = queue.poll();

                if (position == 100)
                    return count;

                for (int i = 1; i <= 6; i++) {
                    int nx = position + i;

                    if (nx > 100)
                        continue;

                    if (!visited[nx]) {
                        if (nx != maps[nx]) {
                            visited[nx] = true;
                            nx = maps[nx];
                        }

                        visited[nx] = true;
                        queue.offer(nx);
                    }
                }
            }

            count++;
        }

        return count;
    }

    private static void init() throws IOException {
        for (int i = 0; i <= 100; i++)
            maps[i] = i;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            maps[a] = b;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            maps[a] = b;
        }
    }
}
