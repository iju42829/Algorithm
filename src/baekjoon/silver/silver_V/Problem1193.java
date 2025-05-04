package baekjoon.silver.silver_V;

import java.io.*;

public class Problem1193 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            bw.write("1/1\n");
            bw.close();
            br.close();
            return;
        }

        int count = 2, up = 1, down = 2;
        boolean flag = true;

        while (true) {
            if (count == n) {
                bw.write(up + "/" + down + "\n");
                break;
            }
            if (flag && down == 1) {
                flag = false;
                up++;
            } else if (!flag && up == 1) {
                flag = true;
                down++;
            } else {
                if (flag) {
                    up++;
                    down--;
                } else {
                    up--;
                    down++;
                }
            }
            count++;
        }

        bw.close();
        br.close();
    }
}
