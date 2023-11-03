package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Problem4153 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                if (a == 0 && b == 0 && c == 0) {
                    break;
                }

                if (a * a + b * b == c * c) {
                    bw.write("right\n");

                } else if(a * a == b * b + c * c) {
                    bw.write("right\n");

                } else if(b * b == a * a + c * c) {
                    bw.write("right\n");

                } else {
                    bw.write("wrong\n");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}