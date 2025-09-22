package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem1072 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        double x = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken());
        long z = (long) (y * 100 / x);

        long left = 1;
        long right = 1000000000;
        long answer = -1;

        while (left <= right) {
            long mid = (left + right) / 2;

            long temp = (long) (((y + mid) * 100) / (x + mid));

            if (temp != z) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
