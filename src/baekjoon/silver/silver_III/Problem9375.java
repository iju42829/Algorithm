package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem9375 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(br.readLine());

            Map<String, List<String>> map = new HashMap<>();

            for (int j = 0; j < t; j++) {
                String[] inputs = br.readLine().split(" ");

                if (map.containsKey(inputs[1])) {
                    map.get(inputs[1]).add(inputs[0]);
                } else {
                    List<String> list = new ArrayList<>();
                    list.add(inputs[0]);
                    map.put(inputs[1], list);
                }
            }
            int number = 1;

            for (String key : map.keySet()) {
                number *= map.get(key).size() + 1;
            }

            bw.write((number - 1) + "\n");
        }

        bw.close();
        br.close();
    }
}
