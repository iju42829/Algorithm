package baekjoon.silver.silver_II;

import java.io.*;

public class Problem2607 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        String baseWord = br.readLine();
        int[] baseCount = countArray(baseWord);
        int baseLength = baseWord.length();

        for (int i = 1; i < n; i++) {
            String diffWord = br.readLine();

            int[] diffCount = countArray(diffWord);
            int diffLength = diffWord.length();

            int absCount = 0;

            for (int j = 0; j < 26; j++) {
                absCount += Math.abs(diffCount[j] - baseCount[j]);
            }

            if (absCount == 0) {
                answer++;
            } else if (absCount == 1 && Math.abs(baseLength - diffLength) == 1) {
                answer++;
            } else if (absCount == 2 && baseLength - diffLength == 0) {
                answer++;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }

    private static int[] countArray(String input) {
        int[] count = new int[26];

        for (char c : input.toCharArray()) {
            count[c - 'A']++;
        }

        return count;
    }
}
