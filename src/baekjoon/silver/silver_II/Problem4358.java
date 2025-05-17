package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem4358 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        TreeMap<String, Integer> map = new TreeMap<>();
        String s;
        int total = 0;

        while ((s = br.readLine()) != null) {
            total++;
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + " " + String.format("%.4f", (double) map.get(key) * 100.0 / total));
        }
    }
}
