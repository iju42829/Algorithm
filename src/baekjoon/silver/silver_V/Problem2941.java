package baekjoon.silver.silver_V;

import java.io.*;
import java.util.*;

public class Problem2941 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Set<String> set = new HashSet<>();
    private static String input;

    public static void main(String[] args) throws IOException {
        init();
        int result = solve();

        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static void init() throws IOException {
        input = br.readLine();

        set.add("c=");
        set.add("c-");
        set.add("dz=");
        set.add("d-");
        set.add("lj");
        set.add("nj");
        set.add("s=");
        set.add("z=");
    }

    private static int solve() throws IOException {
        int result = 0;

        while (!input.isEmpty()) {
            boolean flag = false;

            for (String s : set) {
                if (input.startsWith(s)) {
                    result++;

                    int wordSize = s.length();
                    int inputSize = input.length();

                    input = input.substring(wordSize);

                    flag = true;
                }
            }

            if (flag)
                continue;

            result++;
            input = input.substring(1);
        }

        return result;
    }
}
