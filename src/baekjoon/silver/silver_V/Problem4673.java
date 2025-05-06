package baekjoon.silver.silver_V;

import java.io.*;

public class Problem4673 {

    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        boolean[] visited = new boolean[10_001];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10_000; i++) {
            if (!visited[i]) {
                sb.append(i).append("\n");
            }

            int next = i;
            for (char c : String.valueOf(i).toCharArray()) {
                next += (c - '0');
            }

            if (next > 10_000)
                continue;
            visited[next] = true;
        }

        bw.write(sb.toString());
        bw.close();
    }
}
