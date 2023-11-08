package baekjoon.silver.silver_V;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Problem11651 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            int n = Integer.parseInt(br.readLine());
            int[][] pos = new int[n][2];

            StringTokenizer st;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());

                pos[i][0] = Integer.parseInt(st.nextToken());
                pos[i][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(pos, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[1] == o2[1]) {
                        return o1[0] - o2[0];
                    }

                    return o1[1] - o2[1];
                }
            });

            printArray(pos, bw, n);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printArray(int[][] pos, BufferedWriter bw, int n) throws IOException {
        for (int i = 0; i < n; i++) {
            bw.write(pos[i][0] + " " + pos[i][1]);
            bw.newLine();
        }
    }
}
