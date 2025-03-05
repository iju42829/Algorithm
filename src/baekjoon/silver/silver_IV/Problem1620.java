package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem1620 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Map<String, Integer> map = new HashMap<String, Integer>();
    private static String[] nameArr;
    private static int n, m;

    public static void main(String[] args) throws IOException {
        init();
        String result = solve();

        bw.write(result);

        bw.close();
        br.close();
    }

    private static String solve() throws IOException {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String input = br.readLine();

            if (!map.containsKey(input)) {
                sb.append(nameArr[Integer.parseInt(input)]).append("\n");

            } else{
                sb.append(map.get(input)).append("\n");
            }
        }

        return sb.toString();
    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nameArr = new String[n+1];

        for (int i = 1; i <= n; i++) {
            String input = br.readLine();

            map.put(input, i);
            nameArr[i] = input;
        }
    }
}
