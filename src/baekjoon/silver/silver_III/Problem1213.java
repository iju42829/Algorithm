package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem1213 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        int[] words = new int[26];

        String input = br.readLine();

        for (char c : input.toCharArray()) {
            words[c - 'A']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            int wordCount = words[i];

            for (int j = 0; j < wordCount / 2; j++) {
                sb.append((char)('A' + i));
            }
        }

        boolean flag = false;
        boolean fail = false;
        String mem = "";

        for (int i = 0; i < 26; i++) {
            int wordCount = words[i];

            if (wordCount % 2 == 1 && !flag) {
                mem = String.valueOf((char)('A' + i));
                flag = true;

            } else if (wordCount % 2 == 1) {
                fail = true;
                break;
            }
        }

        if (fail) {
            bw.write("I'm Sorry Hansoo\n");
        } else {
            String result = sb.toString() + mem +  sb.reverse().toString();
            bw.write(result + "\n");
        }

        bw.close();
        br.close();
    }
}
