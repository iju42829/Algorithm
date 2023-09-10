package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem15649 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        boolean[] visited;
        int[] answer;
        int n, m;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().split(" ");

            n = Integer.parseInt(input[0]);
            m = Integer.parseInt(input[1]);

            answer = new int[m];
            visited = new boolean[n];

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        dfs(visited, answer, n, m, 0);
    }

    private static void dfs(boolean[] visited, int[] answer, int n, int m, int depth) {
        if (depth == m) {
            for (int ans : answer) {
                System.out.print(ans + " ");
            }
            System.out.println();

            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                answer[depth] = i + 1;

                dfs(visited, answer, n, m, depth + 1);
                visited[i] = false;
            }
        }
    }
}