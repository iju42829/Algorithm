package baekjoon.silver.silver_V;

import java.io.*;

public class Problem1436 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final String six = "666";
    private static int n;

    public static void main(String[] args) throws IOException {
        bw.write(solve() + "\n");

        bw.close();
        br.close();
    }

    private static String solve() throws IOException {
        n = Integer.parseInt(br.readLine());
        int number = 0;
        int count = 0;

        while (true) {
            number++;

            if (String.valueOf(number).contains(six))
                count++;

            if (count == n)
                return String.valueOf(number);
        }
    }
}
