package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem2776 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            Set<Integer> set = new HashSet<>();

            String[] inputs = br.readLine().split(" ");

            for (int j = 0; j < n; j++) {
                set.add(Integer.parseInt(inputs[j]));
            }

            int m = Integer.parseInt(br.readLine());
            inputs = br.readLine().split(" ");

            for (int j = 0; j < m; j++) {
                if (set.contains(Integer.parseInt(inputs[j]))) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            }
        }

        bw.close();
        br.close();
    }
}
