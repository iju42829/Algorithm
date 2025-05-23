package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem1049 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] sixLine = new int[m];
        int[] oneLine = new int[m];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            sixLine[i] = Integer.parseInt(st.nextToken());
            oneLine[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sixLine);
        Arrays.sort(oneLine);

        int result = 0;

        if (sixLine[0] >= oneLine[0] * 6) {
            result = n * oneLine[0];

        } else {
            int temp1 = sixLine[0] * (n / 6) + oneLine[0] * (n % 6);
            int temp2 = sixLine[0] * ((n / 6) + 1);
            result = Math.min(temp1, temp2);
        }

        bw.write(result + "\n");

        bw.close();
        br.close();

    }
}
