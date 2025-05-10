package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem21921 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxResult = 0;
        int count = 1;
        int lt = 0, rt = 0;

        for (rt = 0; rt < x; rt++) {
            maxResult += arr[rt];
        }

        int tempResult = maxResult;

        while (rt < n) {
            tempResult -= arr[lt++];
            tempResult += arr[rt++];

            if (tempResult == maxResult) {
                count++;
            }
            else if (tempResult > maxResult) {
                maxResult = tempResult;
                count = 1;
            }
        }

        if (maxResult == 0) {
            bw.write("SAD\n");
        } else {
            bw.write(maxResult + "\n");
            bw.write(count + "\n");
        }

        bw.close();
        br.close();
    }
}
