package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem11501 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int maxPrice = arr[n-1];
            long money = 0;

            for (int j = n - 2; j >= 0; j--) {
                if (arr[j] <= maxPrice) {
                    money += maxPrice - arr[j];
                }
                else {
                    maxPrice = arr[j];
                }
            }

            bw.write(money + "\n");
        }

        bw.close();
        br.close();
    }
}
