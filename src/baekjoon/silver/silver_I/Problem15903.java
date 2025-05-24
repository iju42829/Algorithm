package baekjoon.silver.silver_I;

import java.io.*;
import java.util.*;

public class Problem15903 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(Long.parseLong(st.nextToken()));
        }

        for (int i = 0; i < m; i++) {
            long a = pq.poll();
            long b = pq.poll();

            pq.add(a + b);
            pq.add(a + b);
        }

        long result = 0;
        while (!pq.isEmpty())
            result += pq.poll();

        bw.write(result + "\n");
        bw.close();
        br.close();
    }
}
