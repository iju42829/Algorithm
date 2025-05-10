package baekjoon.silver.silver_I;

import java.io.*;
import java.util.*;

public class Problem2531 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int lt = 0, rt = k, maxCount = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        if (!map.containsKey(c)) {
            maxCount = 1;
        }

        maxCount += map.size();

        while (lt < n) {
            if (map.get(arr[lt]) == 1) {
                map.remove(arr[lt]);
            } else {
                map.put(arr[lt], map.get(arr[lt]) - 1);
            }

            if (map.containsKey(arr[rt % n])) {
                map.put(arr[rt % n], map.get(arr[rt % n]) + 1);
            } else {
                map.put(arr[rt % n], 1);
            }

            int tempCount = map.size();

            if (!map.containsKey(c)) {
                tempCount++;
            }

            maxCount = Math.max(maxCount, tempCount);

            lt++;
            rt++;
        }

        bw.write(maxCount + "\n");
        bw.close();
        br.close();
    }
}
