package baekjoon.silver.silver_V;

import java.io.*;
import java.util.*;

public class Problem1439 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        String input = br.readLine();

        int zeroCnt = 0, oneCnt = 0;
        char memory;

        if (input.charAt(0) == '0') {
            zeroCnt++;
            memory = '0';
        } else {
            oneCnt++;
            memory = '1';
        }

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != memory) {
                if (memory == '1') {
                    zeroCnt++;
                    memory = '0';
                } else {
                    oneCnt++;
                    memory = '1';
                }
            }
        }

        bw.write(Math.min(zeroCnt, oneCnt) + "\n");
        bw.close();
        br.close();
    }
}
