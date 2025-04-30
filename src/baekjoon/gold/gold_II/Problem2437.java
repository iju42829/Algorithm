package baekjoon.gold.gold_II;

import java.io.*;
import java.util.*;

public class Problem2437 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());


        Arrays.sort(arr);

        int result = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= result + 1) {
                result += arr[i];
            } else {
                break;
            }
        }

        bw.write((result + 1) + "\n");

        bw.close();
        br.close();
    }
}
