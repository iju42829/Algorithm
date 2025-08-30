package baekjoon.gold.gold_IV;

import java.io.*;

public class Problem2138 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        char[] aBulb = new char[n];
        char[] aBulbDown = new char[n];
        char[] bBulb = new char[n];

        String inputA = br.readLine();
        String inputB = br.readLine();

        for (int i = 0; i < n; i++) {
            aBulb[i] = inputA.charAt(i);
            aBulbDown[i] = inputA.charAt(i);
        }

        for (int i = 0; i < n; i++) {
            bBulb[i] = inputB.charAt(i);
        }

        toggle(aBulb, 0, n);
        int aBulbCount = 1;

        for (int i = 1; i < n; i++) {
            if (aBulb[i-1] != bBulb[i-1]) {
                toggle(aBulb, i, n);
                aBulbCount++;
            }
        }

        int aBulbDownCount = 0;
        for (int i = 1; i < n; i++) {
            if (aBulbDown[i-1] != bBulb[i-1]) {
                toggle(aBulbDown, i, n);
                aBulbDownCount++;
            }
        }

        int answer = Integer.MAX_VALUE;

        if (check(aBulb, bBulb, n)) {
            answer = Math.min(answer, aBulbCount);
        }

        if (check(aBulbDown, bBulb, n)) {
            answer = Math.min(answer, aBulbDownCount);
        }

        if (answer == Integer.MAX_VALUE)
            answer = -1;

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }

    private static void toggle(char[] arr, int idx, int n) {
        if (idx != 0)
            arr[idx - 1] = arr[idx - 1] == '0' ? '1' : '0';

        arr[idx] = arr[idx] == '0' ? '1' : '0';

        if (idx != n - 1)
            arr[idx + 1] = arr[idx + 1] == '0' ? '1' : '0';
    }

    private static boolean check(char[] arr1, char[] arr2, int n) {
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
