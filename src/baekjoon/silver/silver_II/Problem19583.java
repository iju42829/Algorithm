package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem19583 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int changeMin(String time) {
        String[] timeSplit = time.split(":");

        return Integer.parseInt(timeSplit[0]) * 60 + Integer.parseInt(timeSplit[1]);
    }

    public static void main(String[] args) throws IOException {
        String[] inputs = br.readLine().split(" ");

        int S = changeMin(inputs[0]), E = changeMin(inputs[1]), Q = changeMin(inputs[2]);

        String line = null;

        Set<String> enter = new HashSet<>();
        Set<String> remove = new HashSet<>();

        while ((line = br.readLine()) != null) {
            inputs = line.split(" ");
            int time = changeMin(inputs[0]);
            String name = inputs[1];

            if (time <= S) {
                enter.add(name);
            }

            if (time >= E && time <= Q) {
                remove.add(name);
            }
        }

        int answer = 0;

        for (String s : enter) {
            if (remove.contains(s))
                answer++;
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
