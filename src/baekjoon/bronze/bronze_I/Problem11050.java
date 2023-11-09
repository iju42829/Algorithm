package baekjoon.bronze.bronze_I;

import java.io.*;
import java.util.StringTokenizer;

public class Problem11050 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int up = 1;
            int down = 1;

            for (int i = 0; i < k; i++) {
                up *= n - i;
                down *= k - i;
            }

            bw.write(up / down + "\n");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}