package baekjoon.bronze.bronze_II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem2587 {
    private static final int n = 5;

    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int[] numbers = new int[n];
            int avg = 0;

            for (int i = 0; i < n; i++) {
                numbers[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(numbers);

            for (int num : numbers) {
                avg += num;
            }

            System.out.println(avg / 5);
            System.out.println(numbers[2]);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
