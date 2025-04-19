package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem1120 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int result = solve();

        bw.write(result + "\n");
        bw.close();
        br.close();
    }

    public static int solve() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        int count = 0;

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) count++;
            }
            return count;
        }
        else {
            int diff = Integer.MAX_VALUE;

            for (int i = 0; i <= b.length() - a.length(); i++) {
                int aIdx = 0;
                int bIdx = i;
                int tempCount = 0;
                int loopCount = 0;

                while (loopCount < a.length()) {
                    if (a.charAt(aIdx) != b.charAt(bIdx)) {
                        tempCount++;
                    }
                    aIdx++;
                    bIdx++;
                    loopCount++;
                }

                diff = Math.min(diff, tempCount);
            }

            return diff;
        }
    }
}
