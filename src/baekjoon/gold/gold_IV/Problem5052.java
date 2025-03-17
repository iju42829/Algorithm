package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem5052 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String result = solve();
        bw.write(result);

        bw.close();
        br.close();
    }

    private static String solve() throws IOException {
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int c = 0; c < t; c++) {
            int n = Integer.parseInt(br.readLine());

            boolean flag = true;

            String[] phoneNumberArray = new String[n];

            for (int i = 0; i < n; i++)
                phoneNumberArray[i] = br.readLine();
            Arrays.sort(phoneNumberArray);

            for (int i = 0; i < n - 1; i++) {
                if (phoneNumberArray[i+1].startsWith(phoneNumberArray[i])) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                sb.append("YES").append("\n");
            else
                sb.append("NO").append("\n");
        }

        return sb.toString();
    }
}
