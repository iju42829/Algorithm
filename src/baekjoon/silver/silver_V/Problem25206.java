package baekjoon.silver.silver_V;

import java.io.*;
import java.util.*;

public class Problem25206 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Map<String, Double> map = new HashMap<>();
    private static final int N = 20;

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void init() {
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);
    }

    private static void solve() throws IOException {
        init();
        double totalPoint = 0.0;
        double gradePoint = 0.0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            st.nextToken();

            double tempGradePoint = Double.parseDouble(st.nextToken());
            String findGrade = st.nextToken();
            if (!findGrade.equals("P")) {
                gradePoint += tempGradePoint;

                totalPoint += map.get(findGrade) * tempGradePoint;
            }
        }

        if (totalPoint == 0.0) {
            bw.write(String.format("%.6f\n", 0.0));
        } else {
            bw.write(String.format("%.6f\n", totalPoint / gradePoint));
        }

        bw.close();
        br.close();
    }
}
