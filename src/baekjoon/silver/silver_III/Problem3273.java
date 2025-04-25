package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem3273 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);

        int x = Integer.parseInt(br.readLine());

        int lt = 0, rt = n-1;
        int count = 0;

        while (lt < rt) {
            int tempNumber = numbers[lt] + numbers[rt];

            if (tempNumber == x) {
                count++;
                rt--;
                lt++;
            } else if (tempNumber < x) {
                lt++;
            } else {
                rt--;
            }
        }

        bw.write(count + "\n");
        bw.close();
        br.close();
    }
}
