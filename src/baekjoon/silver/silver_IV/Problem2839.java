package baekjoon.silver.silver_IV;

import java.io.*;

public class Problem2839 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());

            int[] sugar = new int[5001];

            dp(sugar);

            if (sugar[n] == 0) {
                bw.write("-1\n");
            }

            else {
                bw.write(sugar[n] + "\n");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void dp(int[] sugar) {
        sugar[3] = sugar[5] = 1;

        for (int i = 6; i <= 5000; i++) {
            if (i % 5 == 0) {
                sugar[i] = sugar[i-5] + 1;

            } else if(i % 3 == 0) {
                sugar[i] = sugar[i-3] + 1;

            } else {
                if (sugar[i - 3] != 0 & sugar[i - 5] != 0) {
                    sugar[i] = Math.min(sugar[i - 3], sugar[i - 5]) + 1;
                }
            }
        }
    }
}