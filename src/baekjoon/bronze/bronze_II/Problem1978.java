package baekjoon.bronze.bronze_II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1978 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        int n;
        int count = 0;
        int[] number;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());

            number = new int[n];

            String[] input = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                number[i] = Integer.parseInt(input[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int num : number) {
            boolean isPrime = true;

            if (num <= 1)
                continue;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime =  false;
                    break;
                }
            }

            if (isPrime)
                count++;
        }

        System.out.println(count);
    }
}
