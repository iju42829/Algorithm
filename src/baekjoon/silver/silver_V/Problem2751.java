package baekjoon.silver.silver_V;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Problem2751 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {
            int n = Integer.parseInt(br.readLine());

            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(numbers);

            printArray(bw, n, numbers);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printArray(BufferedWriter bw, int n, int[] numbers) throws IOException {
        bw.write(numbers[0] + "\n");

        for (int i = 1; i < n; i++) {
            if (numbers[i] != numbers[i-1]) {
                bw.write(numbers[i] + "\n");
            }
        }

    }
}
