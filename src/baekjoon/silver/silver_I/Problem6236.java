package baekjoon.silver.silver_I;

import java.io.*;
import java.util.*;

public class Problem6236 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] moneyArr;
    private static int n, m;

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        init();

        int lt = Arrays.stream(moneyArr).max().getAsInt();
        int rt = Arrays.stream(moneyArr).sum();
        int result = Integer.MAX_VALUE;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (check(mid)) {
                result = Math.min(mid, result);
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        bw.write(result + "\n");
        bw.close();
        br.close();
    }

    private static boolean check(int mid) {
        int count = 1;
        int k = mid;

        for (int i = 0; i < n; i++) {
            if (moneyArr[i] > k) {
                k = mid;
                count++;
            }
            k -= moneyArr[i];
        }

        return count <= m;
    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        moneyArr = new int[n];

        for (int i = 0; i < n; i++) {
            moneyArr[i] = Integer.parseInt(br.readLine());
        }
    }
}
