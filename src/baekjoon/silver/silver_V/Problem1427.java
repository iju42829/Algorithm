package baekjoon.silver.silver_V;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Problem1427 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String n = br.readLine();
            Character[] numbers = new Character[n.length()];

            for (int i = 0; i < n.length(); i++) {
                numbers[i] = n.charAt(i);
            }

            Arrays.sort(numbers, Collections.reverseOrder());

            StringBuilder sb = new StringBuilder();

            for (char num : numbers) {
                sb.append(num);
            }

            bw.write(sb.toString() + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}