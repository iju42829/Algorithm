package baekjoon.bronze.bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem27433 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(br.readLine());

            System.out.println(factorial(n));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}