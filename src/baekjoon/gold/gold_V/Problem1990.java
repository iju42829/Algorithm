package baekjoon.gold.gold_V;

import java.io.*;
import java.util.*;

public class Problem1990 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int PRIME_ARRAY_SIZE = 100_000_000;
    private static final boolean[] isPrime = new boolean[PRIME_ARRAY_SIZE + 1];
    private static final StringBuilder sb = new StringBuilder();
    private static int a, b;

    public static void main(String[] args) throws IOException{
        init();
        solve();

        bw.write(sb.toString());

        bw.close();
        br.close();
    }

    private static void solve() {
        for (int i = a; i <= b; i++) {
            if (!isPrime[i]) {
                String tempNumber = String.valueOf(i);
                int size = tempNumber.length();

                if (size == 1)
                    sb.append(tempNumber).append("\n");

                else {
                    int loopCount = size / 2;
                    int lt = 0, rt = size - 1;

                    boolean flag = true;
                    for (int j = 0; j < loopCount; j++) {
                        if (tempNumber.charAt(lt + j) != tempNumber.charAt(rt - j)) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        sb.append(tempNumber).append("\n");
                    }
                }
            }
        }

        sb.append("-1").append("\n");
    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        isPrime[0] = true;
        isPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(PRIME_ARRAY_SIZE); i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= PRIME_ARRAY_SIZE; j += i) {
                    isPrime[j] = true;
                }
            }
        }
    }
}
