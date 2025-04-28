package baekjoon.silver.silver_V;

import java.io.*;
import java.util.*;

public class Problem11728 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < 2; i++) {
            StringTokenizer tempSt = new StringTokenizer(br.readLine());

            while (tempSt.hasMoreTokens()) {
                pq.add(Integer.parseInt(tempSt.nextToken()));
            }
        }

        while (!pq.isEmpty()) {
            sb.append(pq.poll()).append(" ");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
