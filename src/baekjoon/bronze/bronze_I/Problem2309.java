package baekjoon.bronze.bronze_I;

import java.io.*;
import java.util.*;

public class Problem2309 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int[] person = new int[9];
    private static final int[] selected = new int[7];
    private static final boolean[] visited = new boolean[9];
    private static boolean flag = false;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 9; i++) {
            person[i] = Integer.parseInt(br.readLine());
        }

        dfs(0);

        Arrays.sort(selected);

        for (int s : selected)
            bw.write(s + "\n");

        bw.close();
        br.close();
    }

    private static void dfs(int depth) {
        if (depth == 7) {
            int result = 0;

            for (int i = 0; i < 7; i++) {
                result += selected[i];
            }

            if (result == 100)
                flag = true;

            return;
        }

        for (int i = 0; i < 9; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            selected[depth] = person[i];
            dfs(depth + 1);
            if (flag) return;
            visited[i] = false;
        }
    }
}
