package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem2910 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static class NumberCount {
        int number;
        int count;
        int firstIndex;

        public NumberCount(int number, int count, int firstIndex) {
            this.number = number;
            this.count = count;
            this.firstIndex = firstIndex;
        }
    }

    public static void main(String[] args) throws IOException {
        String[] inputs = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(inputs[0]), c = Integer.parseInt(inputs[1]);
        Map<Integer, NumberCount> map = new HashMap<>();

        inputs = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(inputs[i]);

            NumberCount numberCount = map.get(x);

            if (numberCount == null) {
                map.put(x, new NumberCount(x, 1, i));
            } else {
                numberCount.count++;
            }
        }

        List<NumberCount> numberCountList = new ArrayList<>(map.values());

        numberCountList.sort((o1, o2) -> {
            if (o1.count != o2.count) {
                return Integer.compare(o2.count, o1.count);
            }
            return Integer.compare(o1.firstIndex, o2.firstIndex);
        });

        for (NumberCount num : numberCountList) {
            for (int i = 0; i < num.count; i++) {
                sb.append(num.number).append(" ");
            }
        }

        bw.write(sb.toString() + "\n");
        bw.close();
        br.close();
     }
}
