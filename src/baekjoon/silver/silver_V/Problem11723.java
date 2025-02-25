package baekjoon.silver.silver_V;

import java.io.*;
import java.util.*;

public class Problem11723 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Set<Integer> set = new HashSet<>();
    private static int m;

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
            StringTokenizer st = new StringTokenizer(br.readLine());

            String order = st.nextToken();

            if (order.equals("all"))
                for (int j = 1; j <= 20; j++)
                    set.add(j);

            if (order.equals("empty"))
                set.clear();

            if (order.equals("toggle")) {
                int number = Integer.parseInt(st.nextToken());

                if (set.contains(number))
                    set.remove(number);
                else
                    set.add(number);
            }

            if (order.equals("check")) {
                int number = Integer.parseInt(st.nextToken());

                if (set.contains(number))
                    sb.append(1).append("\n");

                else
                    sb.append(0).append("\n");
            }

            if (order.equals("remove"))
                set.remove(Integer.parseInt(st.nextToken()));

            if (order.equals("add"))
                set.add(Integer.parseInt(st.nextToken()));
        }

        return sb.toString();
    }

    private static void init() throws IOException {
        m = Integer.parseInt(br.readLine());
    }
}
