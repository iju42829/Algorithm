package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem1541 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int result = solve();
        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static int solve() throws IOException {
        String[] input = br.readLine().split("-");
        List<Integer> resultList = new ArrayList<>();

        for (String s : input) {
            if (s.contains("+")) {
                int sum = 0;
                String[] temp = s.split("\\+");
                for (String t : temp) sum += Integer.parseInt(t);
                resultList.add(sum);
            }
            else {
                resultList.add(Integer.parseInt(s));
            }
        }

        int result = resultList.get(0);

        for(int i = 1; i < resultList.size(); i++){
            result -= resultList.get(i);
        }

        return result;
    }
}
