package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem2512 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] moneyArr;
    private static int n, m;

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        init();

        int lt = 0, rt = moneyArr[moneyArr.length - 1];

        int answer = Integer.MIN_VALUE;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (check(mid)) {
                answer = Math.max(answer, mid);
                lt = mid + 1;
            } else {
               rt = mid - 1;
            }
        }

        bw.write(answer + "\n");

        bw.close();
        br.close();
    }

    private static boolean check(int mid) {
        int sum = 0;

        for (int money : moneyArr) {
            if (money <= mid) {
                sum += money;
            } else {
              sum += mid;
            }
        }

        if (sum <= m)
            return true;

        return false;
    }

    private static void init() throws IOException {
        n = Integer.parseInt(br.readLine());
        moneyArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            moneyArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(moneyArr);

        m = Integer.parseInt(br.readLine());
    }
}
