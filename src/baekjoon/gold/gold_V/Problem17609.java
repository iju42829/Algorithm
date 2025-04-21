package baekjoon.gold.gold_V;

import java.io.*;

public class Problem17609 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (checkOne(input)) {
                sb.append("0").append("\n");
            } else if (checkTwo(input)) {
                sb.append("1").append("\n");
            } else {
                sb.append("2").append("\n");
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    private static boolean checkOne(String word) {
        char[] wordArray = word.toCharArray();
        int lt = 0, rt = word.length() - 1;
        int mid = word.length() / 2;

        for (int i = 0; i < mid; i++) {
            if (wordArray[lt++] != wordArray[rt--])
                return false;
        }

        return true;
    }

    private static boolean checkTwo(String word) {
        char[] wordArray = word.toCharArray();
        int lt = 0, rt = word.length() - 1;
        int mid = word.length() / 2;
        int count = 0;
        boolean flag = false;

        while (lt <= rt) {
            if (wordArray[lt] != wordArray[rt]) {
                if (checkFinal(word, lt + 1, rt) || checkFinal(word, lt, rt - 1)) {
                    break;
                } else {
                    return false;
                }
            } else {
                lt++;
                rt--;
            }
        }

        return true;
    }

    private static boolean checkFinal(String word, int lt, int rt) {
        while (lt <= rt) {
            if (word.charAt(lt) != word.charAt(rt)) {
                return false;
            }
            lt++;
            rt--;
        }

        return true;
    }
}
