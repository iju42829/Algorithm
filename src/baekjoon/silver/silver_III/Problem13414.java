package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem13414 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] inputs = br.readLine().split(" ");

        int k = Integer.parseInt(inputs[0]), l = Integer.parseInt(inputs[1]);

        Set<String> set = new LinkedHashSet<>();

        for (int i = 0; i < l; i++) {
            String input = br.readLine();

            if (set.contains(input)) {
                set.remove(input);
                set.add(input);
            } else {
                set.add(input);
            }
        }

        int count = 0;

        for (String s : set) {
            if (count == k) break;

            bw.write(s);
            bw.newLine();
            count++;
        }

        bw.close();
        br.close();
    }
}
