package baekjoon.silver.silver_IV;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Problem1920 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (BufferedReader br =new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {

            int n, m;

            n = Integer.parseInt(br.readLine());
            int[] numbers = new int[n];

            String[] input = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                numbers[i] = Integer.parseInt(input[i]);
            }

            Arrays.sort(numbers);

            m = Integer.parseInt(br.readLine());
            input = br.readLine().split(" ");

            for (String s : input) {
                bw.write(binarySearch(numbers, 0, n-1, Integer.parseInt(s)) + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int binarySearch(int[] arr, int start, int end, int key) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return 1;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            }

            if (arr[mid] > key) {
                end = mid - 1;
            }
        }

        return 0;
    }
}