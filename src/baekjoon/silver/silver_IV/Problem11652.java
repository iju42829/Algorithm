package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem11652 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        bw.write(solve() + "\n");

        bw.close();
        br.close();
    }

    private static long solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new HashMap<>();

        long max = 0;
        long result = 0;
        for (int i = 0; i < n; i++) {
            long number = Long.parseLong(br.readLine());

            map.put(number, map.getOrDefault(number, 0) + 1);
            if (map.get(number) > max) {
                max = map.get(number);
                result = number;
            } else if (map.get(number) == max) {
                result = Math.min(result, number);
            }
        }

        return result;
    }
}
