package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem10610 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String result = solve();
        bw.write(result);
        bw.close();
        br.close();
    }

    private static String solve() throws IOException {
        String input = br.readLine();
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for (char c : input.toCharArray()) {
            int number = Integer.parseInt(String.valueOf(c));
            list.add(number);
            sum += number;
        }

        Collections.sort(list, (i1, i2) -> i2 - i1);

        if (list.get(input.length() - 1) != 0 || sum % 3 != 0) {
            return "-1";
        }

        StringBuilder sb = new StringBuilder();

        for (Integer num : list) {
            sb.append(num);
        }

        return sb.toString();
    }
}
