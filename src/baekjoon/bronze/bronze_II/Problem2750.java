package baekjoon.bronze.bronze_II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem2750 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int[] number = new int[n];

            for (int i = 0; i < n; i++) {
                number[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(number);

            StringBuilder sb = new StringBuilder();

            for (int num : number) {
                sb.append(num).append("\n");
            }

            System.out.print(sb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}