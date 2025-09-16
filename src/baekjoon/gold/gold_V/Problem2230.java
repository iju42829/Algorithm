package baekjoon.gold.gold_V;

import java.io.*;
import java.util.*;

public class Problem2230 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        long m = Long.parseLong(inputs[1]);

        long[] numbers = new long[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(numbers);

        int lt = 0, rt = 0;
        long answer = Long.MAX_VALUE;

        while (lt < n && rt < n) {
            long temp = numbers[rt] - numbers[lt];

            if (temp >= m) {
                answer = Math.min(temp, answer);
                lt++;
            } else {
                rt++;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
