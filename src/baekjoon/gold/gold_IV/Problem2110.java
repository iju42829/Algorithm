package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem2110 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] housePosition;
    private static int n, c;

    public static void main(String[] args) throws IOException {
        init();
        int result = solve();

        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static int solve() {
        int result = Integer.MIN_VALUE;

        Arrays.sort(housePosition);
        int lt = 1;
        int rt = housePosition[n - 1] - housePosition[0];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int count = 1;
            int last = housePosition[0];

            for (int i = 1; i < n; i++) {
                if (housePosition[i] - last >= mid) {
                    count++;
                    last = housePosition[i];
                }
            }

            if (count >= c) {
                result = Math.max(result, mid);
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return result;
    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        housePosition = new int[n];

        for (int i = 0; i < n; i++)
            housePosition[i] = Integer.parseInt(br.readLine());
    }
}
