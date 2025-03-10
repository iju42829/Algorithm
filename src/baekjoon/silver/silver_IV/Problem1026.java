package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem1026 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] a, b;
    private static int n;

    public static void main(String[] args) throws IOException {
        init();
        int result = solve();
        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static int solve() {
        Arrays.sort(a);
        Arrays.sort(b);

        int sum = 0;

        for (int i = 0; i < n; i++)
            sum += a[i] * b[n - 1 - i];

        return sum;
    }

    private static void init() throws IOException {
        n = Integer.parseInt(br.readLine());

        a = new int[n];
        b = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            b[i] = Integer.parseInt(st.nextToken());
    }
}
