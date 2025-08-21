package baekjoon.silver.silver_V;

import java.io.*;
import java.util.*;

public class Problem10431 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int p = Integer.parseInt(br.readLine());

        for (int t = 0; t < p; t++) {
            String[] inputs = br.readLine().split(" ");

            int testCase = Integer.parseInt(inputs[0]);

            int[] heights = new int[20];
            for (int i = 1; i <= 20; i++) {
                heights[i-1] = Integer.parseInt(inputs[i]);
            }

            int count = 0;
            List<Integer> list = new ArrayList<>();

            for (int height : heights) {
                int position = list.size();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) > height) {
                        position = i;
                        break;
                    }
                }

                count += list.size() - position;
                list.add(position, height);
            }

            bw.write(testCase + " " + count + "\n");
        }

        bw.close();
        br.close();
    }
}
