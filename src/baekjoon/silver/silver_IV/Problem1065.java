package baekjoon.silver.silver_IV;

import java.io.*;

public class Problem1065 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        int input = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= input; i++) {
            String number = String.valueOf(i);

            if (number.length() == 1 || number.length() == 2) {
                count++;
            }
            else {
                char[] chars = number.toCharArray();
                int diff = chars[0] - chars[1];
                boolean flag = true;

                for (int j = 1; j < chars.length - 1; j++) {
                    if (chars[j] - chars[j+1] != diff) {
                        flag = false;
                        break;
                    }
                }

                if (flag) count++;
            }
        }

        bw.write(count + "\n");
        bw.close();
        br.close();
    }
}
