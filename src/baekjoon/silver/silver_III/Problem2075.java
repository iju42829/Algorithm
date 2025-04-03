package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem2075 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int result = solve();

        bw.write(result + "\n");
        bw.close();
        br.close();
    }

    private static int solve() throws IOException {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                pq.add(Integer.parseInt(st.nextToken()));
            }
        }

        for (int i = 0; i < n-1; i++)
            pq.poll();

        return pq.poll();
    }
}
