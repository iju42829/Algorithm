package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem2217 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] ropeArr;
    private static int n;

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void init() throws IOException {
        n = Integer.parseInt(br.readLine());
        ropeArr = new int[n];

        for (int i = 0; i < n; i++)
            ropeArr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(ropeArr);
    }

    private static void solve() throws IOException {
        init();

        int result = Integer.MIN_VALUE;
        int size = n;

        for (int i = 0; i < n; i++) {
            result = Math.max(result, ropeArr[i] * size);
            size--;
        }

        bw.write(result + "\n");
        bw.close();
        br.close();
    }
}
