package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem2960 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = isPrime(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        bw.write(result + "\n");
        bw.close();
        br.close();
    }

    private static int isPrime(int n, int k) {
        boolean[] primeArr = new boolean[n+1];
        primeArr[0] = true;
        primeArr[1] = true;

        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (!primeArr[i]) {
                count++;

                if (count == k) {
                    return i;
                }

                for (int j = i + i; j <= n; j += i) {
                    if (primeArr[j]) continue;

                    primeArr[j] = true;
                    count++;

                    if (count == k) {
                        return j;
                    }
                }
            }
        }

        return -1;
    }
}
