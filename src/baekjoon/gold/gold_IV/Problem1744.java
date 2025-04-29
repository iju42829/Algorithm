package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem1744 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int one = 0;
        int zero = 0;

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input > 1) {
                positive.add(input);
            }
            else if (input == 1) {
                one++;
            }
            else if (input == 0) {
                zero++;
            }
            else {
                negative.add(input);
            }
        }

        Collections.sort(positive, (o1, o2) -> o2.compareTo(o1));
        Collections.sort(negative);

        int result = 0;

        for (int i = 0; i < positive.size() - 1; i += 2) {
            result +=  positive.get(i) * positive.get(i+1);
        }

        if (positive.size() % 2 == 1) {
            result += positive.get(positive.size() - 1);
        }

        result += one;

        for (int i = 0; i < negative.size() - 1; i += 2) {
            result +=  negative.get(i) * negative.get(i+1);
        }

        if (negative.size() % 2 == 1) {
            if (zero == 0) {
                result += negative.get(negative.size() - 1);
            }
        }

        bw.write(result + "\n");
        bw.close();
        br.close();
    }
}
