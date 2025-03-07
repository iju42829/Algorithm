package baekjoon.gold.gold_V;

import java.io.*;
import java.util.*;

public class Problem2470 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] waterArr;
    private static int n;

    public static void main(String[] args) throws IOException {
        init();
        int[] result = solve();

        bw.write(result[0] + " " + result[1] + "\n");

        bw.close();
        br.close();
    }

    private static int[] solve() {
        Arrays.sort(waterArr);
        int result = Integer.MAX_VALUE;
        int[] resultArr = new int[2];

        int lt = 0;
        int rt = n-1;

        while (lt < rt) {
            int sum = waterArr[lt] + waterArr[rt];
            int temp = Math.abs(sum);

            if (temp < result) {
                result = temp;

                resultArr[0] = waterArr[lt];
                resultArr[1] = waterArr[rt];
            }

            if (sum > 0)
                rt--;
            else
                lt++;
        }

        return resultArr;
    }

    private static void init() throws IOException {
        n = Integer.parseInt(br.readLine());
        waterArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            waterArr[i] = Integer.parseInt(st.nextToken());
    }
}
