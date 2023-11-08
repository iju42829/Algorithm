package baekjoon.gold.gold_V;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1759 {
    private static int l;
    private static int c;
    private static char[] words;
    private static char[] keys;

    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            l = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            keys = new char[l];
            words = new char[c];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < c; i++) {
                words[i] = st.nextToken().charAt(0);
            }

            Arrays.sort(words);

            dfs(0, 0);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void dfs(int start, int depth) {
        if (depth == l) {
            if (validation()) {
                for (char key : keys) {
                    System.out.print(key);
                }

                System.out.println();
            }

            return;
        }

        for (int i = start; i < c; i++) {
            keys[depth] = words[i];
            dfs(i + 1, depth + 1);
        }
    }

    private static boolean validation() {
        int m = 0;
        int j = 0;

        for (int i = 0; i < l; i++) {
            if (keys[i] == 'a' || keys[i] == 'i' || keys[i] == 'e' || keys[i] == 'o' || keys[i] == 'u') {
                m++;
            }
            else {
                j++;
            }
        }

        return m >= 1 && j >= 2;
    }
}