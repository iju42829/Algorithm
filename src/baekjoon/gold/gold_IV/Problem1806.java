package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem1806 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] numbers;
    private static int n, s;

    public static void main(String[] args) throws IOException {
        init();
        int result = solve();

        if (result == Integer.MAX_VALUE) {
            bw.write("0\n");
        } else {
            bw.write(result + "\n");
        }
        bw.close();
        br.close();
    }

    private static int solve() {
        int result = Integer.MAX_VALUE;

        int lt = 0, rt = 0, sum = 0;

        while (true) {
            if (sum >= s) {
                result = Math.min(result, rt - lt);
                sum -= numbers[lt++];
            } else {
                if (rt == n) {
                    break;
                }
                sum += numbers[rt++];
            }
        }

        return result;
    }

    private static void init() throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        numbers = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            numbers[i] = Integer.parseInt(st.nextToken());
    }
}
