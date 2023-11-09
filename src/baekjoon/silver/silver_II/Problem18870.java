package baekjoon.silver.silver_II;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Problem18870 {
    public static void main(String[] args) {
        solution();
    }
    private static void solution() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] pos = new int[n];
            int[] sortedPos = new int[n];
            HashMap<Integer, Integer> rankingMap = new HashMap<>();


            for (int i = 0; i < n; i++) {
                int temp = Integer.parseInt(st.nextToken());
                pos[i] = temp;
                sortedPos[i] = temp;
            }

            Arrays.sort(sortedPos);
            sortedPos = Arrays.stream(sortedPos).distinct().toArray();

            StringBuilder sb = new StringBuilder();

            int count = 0;

            for (int i = 0; i < sortedPos.length; i++) {
                if (!rankingMap.containsKey(sortedPos[i])) {
                    rankingMap.put(sortedPos[i], count);
                    count++;
                }
            }

            for (int p : pos) {
                sb.append(rankingMap.get(p)).append(" ");
            }

            bw.write(sb + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}