package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem30804 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Map<Integer, Integer> map = new HashMap<>();
    private static int[] fruitArr;
    private static int n;

    public static void main(String[] args) throws IOException {
        init();
        int result = solve();

        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static int solve() {
        int answer = 0;
        int lt = 0;
        int rt = 0;

        while (rt < n) {
            map.put(fruitArr[rt], map.getOrDefault(fruitArr[rt], 0) + 1);

            while (map.size() > 2) {
                map.put(fruitArr[lt], map.get(fruitArr[lt]) - 1);

                if (map.get(fruitArr[lt]) == 0)
                    map.remove(fruitArr[lt]);
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
            rt++;
        }

        return answer;
    }

    private static void init() throws IOException {
        n = Integer.parseInt(br.readLine());
        fruitArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int fruit = Integer.parseInt(st.nextToken());
            fruitArr[i] = fruit;
        }
    }
}
