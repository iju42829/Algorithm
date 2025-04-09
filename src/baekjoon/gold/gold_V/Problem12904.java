package baekjoon.gold.gold_V;

import java.io.*;

public class Problem12904 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int result = solve();

        bw.write(result + "\n");
        bw.close();
        br.close();
    }

    private static int solve() throws IOException {
        String s = br.readLine();
        String t = br.readLine();

        while (s.length() != t.length()) {
            int tSize = t.length();
            if (t.charAt(tSize - 1) == 'A') {
                t = t.substring(0, tSize - 1);
            } else if (t.charAt(tSize - 1) == 'B') {
                StringBuilder sb = new StringBuilder(t.substring(0, tSize - 1));
                t = sb.reverse().toString();
            }
        }
        if (s.equals(t)) {
            return 1;
        }
        return 0;
    }
}
