package baekjoon.silver.silver_V;

import java.io.*;
import java.util.*;

public class Problem1475 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String n = br.readLine();

        int[] count = new int[10];

        for (char c : n.toCharArray()) {
            count[c - '0']++;
        }

        int max = (count[6] + count[9]) / 2 + (count[6] + count[9]) % 2;

        for (int i = 0; i < 10; i++) {
            if (i == 6 || i == 9)
                continue;

            max = Math.max(max, count[i]);
        }

        bw.write(max + "\n");
        bw.close();
        br.close();
    }
}
