package baekjoon.bronze.bronze_V;

import java.io.*;

public class Problem2739 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            sb.append(n).append(" * ").append(i).append(" = ")
                    .append(n * i).append("\n");
        }

        bw.write(sb.toString());

        bw.close();
        br.close();
    }
}
