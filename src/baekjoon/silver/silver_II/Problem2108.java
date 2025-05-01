package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem2108 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            sum += arr[i];
        }

        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<>();
        int frequency = 0;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }

        int freq = 0;

        for (Integer key : map.keySet())
            freq = Math.max(freq, map.get(key));

        List<Integer> list = new ArrayList<>();

        for (Integer key : map.keySet())
            if (map.get(key) == freq)
                list.add(key);

        Collections.sort(list);
        int answer;

        if (list.size() == 1)
            answer = list.get(0);
        else
            answer = list.get(1);

        int avg = Math.round((float) sum / n);
        int mid = arr[n / 2];
        int abs = Math.abs(arr[0] - arr[n-1]);

        System.out.println(avg);
        System.out.println(mid);
        System.out.println(answer);
        System.out.println(abs);
    }
}
