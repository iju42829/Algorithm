package baekjoon.silver.silver_II;

import java.io.*;

public class Problem1515 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String input = br.readLine();
        int idx = 0;

        for (int i = 1; ; i++) {
            String num = String.valueOf(i);

            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) == input.charAt(idx)) {
                    idx++;
                }

                if (idx == input.length())
                    break;
            }

            if (idx == input.length()) {
                bw.write(i + "\n");
                break;
            }
        }

        br.close();
        bw.close();
    }
}
