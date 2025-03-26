package baekjoon.bronze.bronze_III;

import java.io.*;
import java.util.*;

public class Problem2562 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String result = solve();

        System.out.println(result);

        br.close();
    }

    private static String solve() throws IOException {
        StringBuilder sb = new StringBuilder();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 9; i++)
            numbers.add(Integer.parseInt(br.readLine()));

        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();

        sb.append(max).append("\n");

        for (int i = 0; i < 9; i++) {
            if (numbers.get(i) == max) {
                sb.append(i+1).append("\n");
                break;
            }
        }

        return sb.toString();
    }
}
