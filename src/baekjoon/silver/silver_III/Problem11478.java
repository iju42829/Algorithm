package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem11478 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Set<String> set = new HashSet<>();
    private static boolean[] visited;
    private static String s;

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        s = br.readLine();
        visited = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(i));
            set.add(temp);
            for (int j = i + 1; j < s.length(); j++) {
                temp += s.charAt(j);
                set.add(temp);
            }
        }

        bw.write(set.size() + "\n");
        bw.close();
        br.close();
    }
}
