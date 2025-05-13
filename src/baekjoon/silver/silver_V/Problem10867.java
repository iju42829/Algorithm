package baekjoon.silver.silver_V;

import java.io.*;
import java.util.*;

public class Problem10867 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(input[i]));
        }

        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        for (int i : list) {
            bw.write(i + " ");
        }

        bw.close();
        br.close();
    }
}
