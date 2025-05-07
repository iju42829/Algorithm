package baekjoon.silver.silver_V;

import java.io.*;
import java.util.*;

public class Problem7568 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] person = new int[n][2];


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            person[i][0] = Integer.parseInt(st.nextToken());
            person[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int weight = person[i][0], height = person[i][1];
            int count = 1;

            for (int j = 0; j < n; j++) {
                if (weight < person[j][0] && height < person[j][1])
                    count++;
            }

            sb.append(count).append(" ");
        }

        bw.write(sb.toString() + "\n");
        bw.close();
        br.close();
    }
}
