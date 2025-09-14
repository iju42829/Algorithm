package baekjoon.silver.silver_III;

import java.io.*;
import java.util.Arrays;

public class Problem7795 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] inputs = br.readLine().split(" ");

            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int index = 0;
            long count = 0;

            int[] aArray = new int[a];
            int[] bArray = new int[b];

            inputs = br.readLine().split(" ");
            for (int j = 0; j < a; j++) {
                aArray[j] = Integer.parseInt(inputs[j]);
            }

            inputs = br.readLine().split(" ");
            for (int j = 0; j < b; j++) {
                bArray[j] = Integer.parseInt(inputs[j]);
            }

            Arrays.sort(aArray);
            Arrays.sort(bArray);

            for (int j = 0; j < a; j++) {

                while (index < b) {
                    if (aArray[j] > bArray[index]) {
                        index++;
                    } else {
                        break;
                    }
                }
                count += index;
            }

            bw.write(count + "\n");
        }

        bw.close();
        br.close();
    }
}
