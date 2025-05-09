package baekjoon.bronze.bronze_III;

import java.io.*;
import java.util.*;

public class Problem2875 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int count = 0;

        while (true) {
            if (n >= 2 && m >= 1 && n + m - k >= 3) {
                count++;
                n -= 2;
                m -= 1;
            }
            else {
                break;
            }
        }

        bw.write(count + "\n");
        bw.close();
        br.close();
    }
}
