package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem12891 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int s, p, a, c, g, t;
    private static String input;

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        init();

        int lt = 0, rt = 0, count = 0, result = 0;
        char[] inputCharArr = input.toCharArray();

        while (rt < input.length()) {
            if (inputCharArr[rt] == 'A') {
                a--;
                rt++;
                count++;
            } else if (inputCharArr[rt] == 'C') {
                c--;
                rt++;
                count++;

            } else if (inputCharArr[rt] == 'G') {
                g--;
                rt++;
                count++;

            } else if (inputCharArr[rt] == 'T') {
                t--;
                rt++;
                count++;
            }

            if (count == p) {
                if (check()) {
                    result++;
                }

                if (inputCharArr[lt] == 'A') {
                    a++;
                } else if (inputCharArr[lt] == 'C') {
                    c++;
                } else if (inputCharArr[lt] == 'G') {
                    g++;
                } else if (inputCharArr[lt] == 'T') {
                    t++;
                }
                lt++;
                count--;
            }
        }

        bw.write(result + "\n");
        bw.close();
        br.close();
    }

    private static boolean check() {
        return a <= 0 && c <= 0 && g <= 0 && t <= 0;
    }

    private static void init() throws IOException {
        st = new StringTokenizer(br.readLine());

        s = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());

        input = br.readLine();

        st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
    }
}
