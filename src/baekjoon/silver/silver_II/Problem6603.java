package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem6603 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] numbers, selected;

    public static void main(String[] args) throws IOException {
        while (true) {
            var st = new StringTokenizer(br.readLine());

            var k = Integer.parseInt(st.nextToken());

            if (k == 0) {
                break;
            }

            numbers = new int[k];
            selected = new int[6];

            for (var i = 0; i < k; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0, 0);
            bw.newLine();
        }

        bw.close();
        br.close();
    }

    private static void dfs(int depth, int start) throws IOException {
        if (depth == 6) {
            for (var s : selected) {
                bw.write(s + " ");
            }
            bw.newLine();

            return;
        }

        for (var i = start; i < numbers.length; i++) {
            selected[depth] = numbers[i];
            dfs(depth + 1, i + 1);
        }
    }
}
