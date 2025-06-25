package baekjoon.silver.silver_V;

import java.io.*;
import java.util.Arrays;

public class Problem15688 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);
        StringBuilder sb = new StringBuilder();
        for (int i : numbers)
            sb.append(i).append("\n");

        System.out.println(sb);
    }
}
