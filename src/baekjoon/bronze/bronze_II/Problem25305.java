package baekjoon.bronze.bronze_II;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem25305 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            int[] scores = new int[n];

            for (int i = 0; i < n; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(scores);

            bw.write(scores[n-k] + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
